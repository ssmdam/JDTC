package com.lwh.jtdc.business.service;

import com.lwh.jtdc.business.enums.TemplateKeyEnum;
import com.lwh.jtdc.business.entity.Comment;
import com.lwh.jtdc.business.entity.Link;
import com.lwh.jtdc.business.entity.MailDetail;

/**
 * 邮件发送
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface MailService {

    /**
     * 普通的发送
     *
     * @param mailDetail
     * @return
     */
    void send(MailDetail mailDetail);

    /**
     * 发送友情链接邮件通知
     *
     * @param link
     * @param keyEnum
     * @return
     */
    void send(Link link, TemplateKeyEnum keyEnum);

    /**
     * 发送评论邮件通知
     *
     * @param comment
     * @param keyEnum
     * @param audit
     * @return
     */
    void send(Comment comment, TemplateKeyEnum keyEnum, boolean audit);

    /**
     * 发送到管理员的友链操作通知
     *
     * @param link
     */
    void sendToAdmin(Link link);

    /**
     * 发送到管理员的评论通知
     *
     * @param comment
     */
    void sendToAdmin(Comment comment);
}
