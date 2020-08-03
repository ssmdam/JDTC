package com.lwh.jtdc.business.service;


import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.RoleResources;

/**
 * 角色资源
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface SysRoleResourcesService extends AbstractService<RoleResources, Long> {

    /**
     * 添加角色资源
     *
     * @param roleId
     * @param resourcesId
     */
    void addRoleResources(Long roleId, String resourcesId);

    /**
     * 通过角色id批量删除
     *
     * @param roleId
     */
    void removeByRoleId(Long roleId);
}
