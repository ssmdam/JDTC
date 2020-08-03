package com.lwh.jtdc.business.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lwh.jtdc.persistence.beans.BizStatistics;

/**
 * @author Chris luo 201635020423
 * @since 1.0
 */
public class Statistics {

    private BizStatistics bizStatistics;

    public Statistics(BizStatistics bizStatistics) {
        this.bizStatistics = bizStatistics;
    }

    public Statistics() {
    }

    @JsonIgnore
    public BizStatistics getBizStatistics() {
        return bizStatistics;
    }

    public String getName() {
        return this.bizStatistics.getName();
    }

    public void setName(String name) {
        this.bizStatistics.setName(name);
    }

    public Integer getValue() {
        return this.bizStatistics.getValue();
    }

    public void setValue(Integer value) {
        this.bizStatistics.setValue(value);
    }
}
