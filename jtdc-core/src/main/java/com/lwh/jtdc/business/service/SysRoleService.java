package com.lwh.jtdc.business.service;


import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.vo.RoleConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Role;

import java.util.List;
import java.util.Map;

/**
 * 角色
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface SysRoleService extends AbstractService<Role, Long> {

    /**
     * 获取ztree使用的角色列表
     *
     * @param uid
     * @return
     */
    List<Map<String, Object>> queryRoleListWithSelected(Integer uid);

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Role> findPageBreakByCondition(RoleConditionVO vo);

    /**
     * 获取用户的角色
     *
     * @param userId
     * @return
     */
    List<Role> listRolesByUserId(Long userId);
}
