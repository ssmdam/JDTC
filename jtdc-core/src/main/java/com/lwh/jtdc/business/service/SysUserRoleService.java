package com.lwh.jtdc.business.service;


import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.UserRole;

/**
 * 用户角色
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface SysUserRoleService extends AbstractService<UserRole, Long> {

    /**
     * 添加用户角色
     *
     * @param userId
     * @param roleIds
     */
    void addUserRole(Long userId, String roleIds);

    /**
     * 根据用户ID删除用户角色
     *
     * @param userId
     */
    void removeByUserId(Long userId);
}
