package com.lwh.jtdc.business.service;

import me.zhyd.oauth.model.AuthCallback;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
public interface AuthService {

    boolean login(String source, AuthCallback callback);

    boolean revoke(String source, Long userId);

    void logout();
}
