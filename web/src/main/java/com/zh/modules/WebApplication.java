package com.zh.modules;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
@EnableCaching
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.zh.modules"})
@MapperScan({"com.zh.modules.dao"})
public class WebApplication {
    public static void main(String args[]){
        SpringApplication.run(WebApplication.class);
    }
}
