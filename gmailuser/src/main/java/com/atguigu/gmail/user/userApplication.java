package com.atguigu.gmail.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmail.user.mapper")
public class userApplication {
    public static void main(String[] args) {
        SpringApplication.run(userApplication.class, args);
    }
}
