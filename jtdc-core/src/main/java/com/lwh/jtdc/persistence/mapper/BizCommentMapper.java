package com.lwh.jtdc.persistence.mapper;

import com.lwh.jtdc.business.vo.CommentConditionVO;
import com.lwh.jtdc.plugin.BaseMapper;
import com.lwh.jtdc.persistence.beans.BizComment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
2018/4/16 16:26
 * @since 1.0
 */
@Repository
public interface BizCommentMapper extends BaseMapper<BizComment> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    List<BizComment> findPageBreakByCondition(CommentConditionVO vo);

    /**
     * 点赞
     *
     * @param id
     */
    void doSupport(Long id);

    /**
     * 点踩
     *
     * @param id
     */
    void doOppose(Long id);

    /**
     * 获取单个评论，关联查询文章信息
     *
     * @param id
     */
    BizComment getById(Long id);
}
