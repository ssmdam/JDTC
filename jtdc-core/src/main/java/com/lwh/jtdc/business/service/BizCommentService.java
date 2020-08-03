package com.lwh.jtdc.business.service;


import com.github.pagehelper.PageInfo;
import com.lwh.jtdc.business.vo.CommentConditionVO;
import com.lwh.jtdc.framework.exception.ZhydCommentException;
import com.lwh.jtdc.framework.object.AbstractService;
import com.lwh.jtdc.business.entity.Comment;

import java.util.List;
import java.util.Map;

/**
 * 评论
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface BizCommentService extends AbstractService<Comment, Long> {

    PageInfo<Comment> findPageBreakByCondition(CommentConditionVO vo);

    Map<String, Object> list(CommentConditionVO vo);

    /**
     * admin发表评论
     *
     * @param comment
     * @return
     */
    void commentForAdmin(Comment comment) throws ZhydCommentException;

    /**
     * 发表评论
     *
     * @param comment
     * @return
     */
    Comment comment(Comment comment) throws ZhydCommentException;

    /**
     * 查询近期评论
     *
     * @param pageSize
     * @return
     */
    List<Comment> listRecentComment(int pageSize);

    /**
     * 查询未审核的评论
     *
     * @param pageSize
     * @return
     */
    List<Comment> listVerifying(int pageSize);

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
}
