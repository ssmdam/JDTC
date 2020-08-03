package com.lwh.jtdc.util;

import org.junit.Test;

/**
 * 密码加密测试工具类
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
public class PasswordUtilTest {

    @Test
    public void passwordTest() throws Exception {
        encryptTest("123456", "admin");
    }

    public void encryptTest(String password, String salt) throws Exception {
        String encrypt = PasswordUtil.encrypt(password, salt);
        System.out.println(encrypt);
        String decrypt = PasswordUtil.decrypt("VpavsFi6DaRqF5o3nziCgw==", "root");
        System.out.println(decrypt);
    }

}
