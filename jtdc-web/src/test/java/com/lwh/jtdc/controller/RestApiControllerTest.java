package com.lwh.jtdc.controller;

import com.lwh.jtdc.BaseJunitTest;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Api接口单元测试
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public class RestApiControllerTest extends BaseJunitTest {

    @Test
    public void qq() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post(host + "/api/qq/843977358")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk())
                // 打印出执行结果
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }
}
