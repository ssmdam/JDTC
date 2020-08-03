package com.lwh.jtdc.persistence.mapper;

import com.lwh.jtdc.plugin.BaseMapper;
import com.lwh.jtdc.persistence.beans.SysConfig;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Repository
public interface SysConfigMapper extends BaseMapper<SysConfig> {
    Map<String, Object> getSiteInfo();
}
