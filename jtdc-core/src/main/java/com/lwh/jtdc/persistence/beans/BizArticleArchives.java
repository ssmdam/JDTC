package com.lwh.jtdc.persistence.beans;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Transient;

/**
 * 文章归档
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BizArticleArchives {
    @Transient
    Long id;
    @Transient
    private String title;
    @Transient
    private String original;
    @Transient
    private String datetime;
}
