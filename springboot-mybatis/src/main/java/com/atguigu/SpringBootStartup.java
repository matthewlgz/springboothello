package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com/atguigu/dao")
@SpringBootApplication
public class SpringBootStartup {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStartup.class, args);
    }

}
