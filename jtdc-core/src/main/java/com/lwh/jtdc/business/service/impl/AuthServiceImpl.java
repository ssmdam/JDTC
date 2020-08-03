package com.lwh.jtdc.business.service.impl;

import com.lwh.jtdc.business.enums.UserTypeEnum;
import com.lwh.jtdc.plugin.oauth.RequestFactory;
import com.lwh.jtdc.util.BeanConvertUtil;
import com.lwh.jtdc.util.SessionUtil;
import com.lwh.jtdc.business.entity.User;
import com.lwh.jtdc.business.service.AuthService;
import com.lwh.jtdc.business.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import me.zhyd.oauth.model.AuthCallback;
import me.zhyd.oauth.model.AuthResponse;
import me.zhyd.oauth.model.AuthUser;
import me.zhyd.oauth.request.AuthRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private SysUserService userService;

    @Override
    public boolean login(String source, AuthCallback callback) {
        AuthRequest authRequest = RequestFactory.getInstance(source).getRequest();
        AuthResponse response = authRequest.login(callback);
        if (response.ok()) {
            AuthUser authUser = (AuthUser) response.getData();
            User newUser = BeanConvertUtil.doConvert(authUser, User.class);
            newUser.setSource(authUser.getSource().toString());
            if (null != authUser.getGender()) {
                newUser.setGender(authUser.getGender().getCode());
            }
            User user = userService.getByUuidAndSource(authUser.getUuid(), authUser.getSource().toString());
            newUser.setUserType(UserTypeEnum.USER);
            if (null != user) {
                newUser.setId(user.getId());
                userService.updateSelective(newUser);
            } else {
                userService.insert(newUser);
            }
            SessionUtil.setUser(newUser);
            return true;
        }
        log.warn("[{}] {}", source, response.getMsg());
        return false;
    }

    @Override
    public boolean revoke(String source, Long userId) {
        return false;
    }

    @Override
    public void logout() {
        SessionUtil.removeUser();
    }
}
