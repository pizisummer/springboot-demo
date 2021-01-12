package com.feiw.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author pizisummer
 */
public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        //加盐算法中的加盐
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);

        /**
         * 打印2次获取到的加密的username和password
         * 第一次
         * HtW89FiXtL4VsfziD+lJCA==
         * vvkUkPO7sGRUX2S1fYhxNA==
         *
         * 第二次
         * itbPKFrYj0B9NChZxNiPaQ==
         * 32bH49rnYyO8cdapBpB06w==
         */
    }
}
