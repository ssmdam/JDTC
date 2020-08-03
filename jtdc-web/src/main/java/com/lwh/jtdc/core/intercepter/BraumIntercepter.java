package com.lwh.jtdc.core.intercepter;

import com.lwh.jtdc.util.RequestUtil;
import com.lwh.jtdc.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import me.zhyd.braum.spring.boot.BraumProcessor;
import me.zhyd.braum.spring.boot.BraumResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/**
 * braum，自动识别恶意请求
 *
 * @author Chris luo 201635020423
 * @since 1.8
 */
@Component
@Slf4j
public class BraumIntercepter implements HandlerInterceptor {
    private static final int SUCCESS = 1;
    @Autowired
    private BraumProcessor processor;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        BraumResponse br = processor.process(request);
        if(br.getCode() == SUCCESS) {
            return true;
        }
        String errorMsg = String.format("第%s次被限制！", br.getLimitCount());
        log.warn(errorMsg);
        if(RequestUtil.isAjax(request)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.write(ResultUtil.error(errorMsg).toJson());
            writer.flush();
            writer.close();
            return false;
        }
        request.setAttribute("errorMsg", errorMsg);
        request.setAttribute("expire", TimeUnit.MILLISECONDS.toSeconds(br.getExpire()));
        request.getRequestDispatcher("/error/403").forward(request, response);
        return false;
    }
}
