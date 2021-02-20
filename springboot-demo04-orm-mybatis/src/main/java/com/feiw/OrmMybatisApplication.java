package com.feiw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author pizisummer
 */
@SpringBootApplication
/**
 * 扫描com.feiw.mapper这个package，声明此package下都是mapper类
 */
//@MapperScan("com.feiw.mapper")
/**
 * tk的MapperScan
 */
@MapperScan("com.feiw.tk.mapper")
public class OrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisApplication.class, args);
    }

}
