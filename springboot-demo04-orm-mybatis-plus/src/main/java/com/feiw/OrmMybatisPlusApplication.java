package com.feiw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author pizisummer
 */
@SpringBootApplication
@MapperScan("com.feiw.mapper")
public class OrmMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisPlusApplication.class, args);
    }

}
