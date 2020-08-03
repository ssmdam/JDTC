package com.lwh.jtdc.file.alioss.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
@Data
public class RefererEntity extends AbstractEntity {

    List<String> refererList;

    public RefererEntity(String bucketName) {
        super(bucketName);
    }

    public void setRefererList(List<String> refererList) {
        this.refererList = refererList;
    }
}
