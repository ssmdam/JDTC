package com.lwh.jtdc.business.service;


import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.vo.LinkConditionVO;
import com.lwh.jtdc.framework.exception.ZhydLinkException;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Link;

import java.util.List;
import java.util.Map;

/**
 * 友情链接
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface SysLinkService extends AbstractService<Link, Long> {

    Link getOneByUrl(String url);

    PageInfo<Link> findPageBreakByCondition(LinkConditionVO vo);

    /**
     * 查询可在首页显示的友情链接列表
     *
     * @return
     */
    List<Link> listOfIndex();

    /**
     * 查询可在内页显示的友情链接列表
     *
     * @return
     */
    List<Link> listOfInside();

    /**
     * 查询已禁用的友情链接列表
     *
     * @return
     */
    List<Link> listOfDisable();

    /**
     * 分组获取所有连接
     * {index:首页显示,inside:内页,disable:禁用}
     *
     * @return
     */
    Map<String, List<Link>> listAllByGroup();

    /**
     * 自动添加友链
     *
     * @param link
     * @return
     */
    boolean autoLink(Link link) throws ZhydLinkException;
}
