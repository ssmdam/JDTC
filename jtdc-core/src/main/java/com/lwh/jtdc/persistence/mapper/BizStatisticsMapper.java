package com.lwh.jtdc.persistence.mapper;

import com.lwh.jtdc.persistence.beans.BizStatistics;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 统计
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
2018/4/16 16:26
 * @since 1.0
 */
@Repository
public interface BizStatisticsMapper {

    List<BizStatistics> listSpider();

    List<BizStatistics> listType();
}
