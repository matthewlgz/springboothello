package com.atguigu.springboot;

import com.atguigu.springboot.Pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MySpringbootApplication {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(MySpringbootApplication.class, args);
        User user = (User) run.getBean("user");

        System.out.println(user);
    }
}
