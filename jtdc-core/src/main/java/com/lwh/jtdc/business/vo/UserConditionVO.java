package com.lwh.jtdc.business.vo;

import com.lwh.jtdc.business.entity.User;
import com.lwh.jtdc.framework.object.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserConditionVO extends BaseConditionVO {
    private User user;
}
