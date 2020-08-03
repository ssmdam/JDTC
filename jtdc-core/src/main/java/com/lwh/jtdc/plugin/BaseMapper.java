package com.lwh.jtdc.plugin;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 公有Mapper
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
    // 特别注意，该接口不能被扫描到，否则会出错
}
