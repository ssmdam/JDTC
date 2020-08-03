package com.lwh.jtdc.controller;

import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.enums.ResponseStatus;
import com.lwh.jtdc.business.vo.TypeConditionVO;
import com.lwh.jtdc.util.ResultUtil;
import com.lwh.jtdc.business.annotation.BussinessLog;
import com.lwh.jtdc.business.entity.Type;
import com.lwh.jtdc.business.service.BizTypeService;
import com.lwh.jtdc.framework.object.PageResult;
import com.lwh.jtdc.framework.object.ResponseVO;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章类型管理
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@RestController
@RequestMapping("/type")
public class RestTypeController {
    @Autowired
    private BizTypeService typeService;

    @RequiresPermissions("types")
    @PostMapping("/list")
    public PageResult list(TypeConditionVO vo) {
        vo.setPageSize(Integer.MAX_VALUE);
        PageInfo<Type> pageInfo = typeService.findPageBreakByCondition(vo);
        return ResultUtil.tablePage(pageInfo);
    }

    @RequiresPermissions("type:add")
    @PostMapping(value = "/add")
    @BussinessLog("添加分类")
    public ResponseVO add(Type type) {
        typeService.insert(type);
        return ResultUtil.success("文章类型添加成功！新类型 - " + type.getName());
    }

    @RequiresPermissions(value = {"type:batchDelete", "type:delete"}, logical = Logical.OR)
    @PostMapping(value = "/remove")
    @BussinessLog("删除分类")
    public ResponseVO remove(Long[] ids) {
        if (null == ids) {
            return ResultUtil.error(500, "请至少选择一条记录");
        }
        for (Long id : ids) {
            typeService.removeByPrimaryKey(id);
        }
        return ResultUtil.success("成功删除 [" + ids.length + "] 个文章类型");
    }

    @RequiresPermissions("type:get")
    @PostMapping("/get/{id}")
    @BussinessLog("获取分类详情")
    public ResponseVO get(@PathVariable Long id) {
        return ResultUtil.success(null, this.typeService.getByPrimaryKey(id));
    }

    @RequiresPermissions("type:edit")
    @PostMapping("/edit")
    @BussinessLog("编辑分类")
    public ResponseVO edit(Type type) {
        try {
            typeService.updateSelective(type);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error("文章类型修改失败！");
        }
        return ResultUtil.success(ResponseStatus.SUCCESS);
    }

    @PostMapping("/listAll")
    public ResponseVO listType() {
        return ResultUtil.success(null, typeService.listTypeForMenu());
    }

    @PostMapping("/listParent")
    public ResponseVO listParent() {
        return ResultUtil.success(null, typeService.listParent());
    }

}
