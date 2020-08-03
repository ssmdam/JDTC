package com.lwh.jtdc.plugin.oauth;

import me.zhyd.oauth.exception.AuthException;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * request工厂类， 生产具体的authRequest
 *
 * @author Chris luo 201635020423
 * @since 1.8
 */
public class RequestFactory {

    public static Map<String, OauthRequest> requestMap = new HashMap<>();

    public static OauthRequest getInstance(String source) {
        if (StringUtils.isEmpty(source)) {
            throw new AuthException("请指定第三方平台");
        }
        OauthRequest request = requestMap.get(source);
        if (null == request) {
            throw new AuthException("当前系统暂不支持该平台[" + source + "]的授权登录");
        }
        return request;
    }

    public static void registerRequest(String type, OauthRequest request) {
        requestMap.put(type, request);
    }

}
