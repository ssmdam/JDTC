package com.lwh.jtdc.persistence.beans;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Transient;

/**
 * 统计
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BizStatistics {
    @Transient
    private String name;
    @Transient
    private Integer value;
}
