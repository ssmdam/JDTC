package com.lwh.jtdc.persistence.mapper;

import com.lwh.jtdc.persistence.beans.BizArticleArchives;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
2018/4/16 16:26
 * @since 1.0
 */
@Repository
public interface BizArticleArchivesMapper {

    List<BizArticleArchives> listArchives();
}
