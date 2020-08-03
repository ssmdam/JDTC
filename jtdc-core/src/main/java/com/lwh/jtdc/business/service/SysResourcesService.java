package com.lwh.jtdc.business.service;

import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.vo.ResourceConditionVO;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Resources;

import java.util.List;
import java.util.Map;

/**
 * 系统资源
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface SysResourcesService extends AbstractService<Resources, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Resources> findPageBreakByCondition(ResourceConditionVO vo);

    /**
     * 获取用户的资源列表
     *
     * @param map
     * @return
     */
    List<Resources> listUserResources(Map<String, Object> map);

    /**
     * 获取ztree使用的资源列表
     *
     * @param rid
     * @return
     */
    List<Map<String, Object>> queryResourcesListWithSelected(Long rid);

    /**
     * 获取资源的url和permission
     *
     * @return
     */
    List<Resources> listUrlAndPermission();

    /**
     * 获取所有可用的菜单资源
     *
     * @return
     */
    List<Resources> listAllAvailableMenu();

    /**
     * 获取用户关联的所有资源
     *
     * @param userId
     * @return
     */
    List<Resources> listByUserId(Long userId);
}
