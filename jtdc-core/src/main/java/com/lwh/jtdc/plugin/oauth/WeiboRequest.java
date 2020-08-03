package com.lwh.jtdc.plugin.oauth;

import com.lwh.jtdc.framework.property.JustAuthProperties;
import me.zhyd.oauth.config.AuthConfig;
import me.zhyd.oauth.request.AuthRequest;
import me.zhyd.oauth.request.AuthWeiboRequest;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
@Component
public class WeiboRequest implements OauthRequest, InitializingBean {

    @Autowired
    private JustAuthProperties properties;

    @Override
    public AuthRequest getRequest() {
        AuthConfig authConfig = properties.getWeibo();
        return new AuthWeiboRequest(AuthConfig.builder()
                .clientId(authConfig.getClientId())
                .clientSecret(authConfig.getClientSecret())
                .redirectUri(authConfig.getRedirectUri())
                .build());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        RequestFactory.registerRequest("weibo", this);
    }
}
