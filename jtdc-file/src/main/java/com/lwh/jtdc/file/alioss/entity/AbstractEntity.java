package com.lwh.jtdc.file.alioss.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractEntity {
    private String bucketName;

    public AbstractEntity() {
    }

    public AbstractEntity(String bucketName) {
        this.bucketName = bucketName;
    }
}
