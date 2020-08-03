package com.lwh.jtdc.persistence.beans;

import com.lwh.jtdc.framework.object.AbstractDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysConfig extends AbstractDO {
    private String configKey;
    private String configValue;
}
