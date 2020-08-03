package com.lwh.jtdc.persistence.mapper;

import com.lwh.jtdc.business.vo.ArticleLoveConditionVO;
import com.lwh.jtdc.plugin.BaseMapper;
import com.lwh.jtdc.persistence.beans.BizArticleLove;
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
public interface BizArticleLoveMapper extends BaseMapper<BizArticleLove> {

    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<BizArticleLove> findPageBreakByCondition(ArticleLoveConditionVO vo);
}
