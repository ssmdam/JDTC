package com.lwh.jtdc.service;

import com.alibaba.fastjson.JSON;
import com.lwh.jtdc.BaseJunitTest;
import com.lwh.jtdc.business.service.SysConfigService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
public class SysConfigServiceImplTest extends BaseJunitTest {

    @Autowired
    private SysConfigService configService;

    @Test
    public void comment() throws InterruptedException {
        System.out.println(JSON.toJSONString(configService.getConfigs()));
    }
}
