package com.lwh.jtdc.core.shiro;

import java.util.Map;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
public interface ShiroService {

    Map<String, String> loadFilterChainDefinitions();

    void updatePermission();

    void reloadAuthorizingByRoleId(Long roleId);
}
