package com.lwh.jtdc.persistence.mapper;

import com.lwh.jtdc.business.vo.FileConditionVO;
import com.lwh.jtdc.plugin.BaseMapper;
import com.lwh.jtdc.persistence.beans.BizFile;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author innodev java team
 * @version 1.0
2018/12/14 09:23
 * @since 1.8
 */
@Repository
public interface BizFileMapper extends BaseMapper<BizFile> {

    List<BizFile> findPageBreakByCondition(FileConditionVO vo);
}
