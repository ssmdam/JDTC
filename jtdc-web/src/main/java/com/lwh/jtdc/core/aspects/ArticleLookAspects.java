package com.lwh.jtdc.core.aspects;

import com.lwh.jtdc.util.IpUtil;
import com.lwh.jtdc.util.SessionUtil;
import com.lwh.jtdc.business.entity.ArticleLook;
import com.lwh.jtdc.core.schedule.ArticleLookTask;
import com.lwh.jtdc.framework.holder.RequestHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 文章浏览记录aop操作
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Slf4j
@Component
@Aspect
@Order(1)
public class ArticleLookAspects {

    @Autowired
    private ArticleLookTask task;

    @Pointcut("execution(* com.lwh.jtdc.controller.RenderController.article(..))")
    public void pointcut() {
        // 切面切入点
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length > 0) {
            String userIp = IpUtil.getRealIp(RequestHolder.getRequest());
            Long articleId = (Long) args[1];
            ArticleLook articleLook = new ArticleLook();
            articleLook.setArticleId(articleId);
            articleLook.setUserIp(userIp);
            articleLook.setLookTime(new Date());
            if (SessionUtil.getUser() != null) {
                articleLook.setUserId(SessionUtil.getUser().getId());
            }
            task.addLookRecordToQueue(articleLook);
        }
    }
}
