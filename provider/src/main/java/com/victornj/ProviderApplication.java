package com.victornj;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is a simple exercise of dubbo provideer
 * Dubbo version 2.7.3
 * Spring boot version 2.1.10.RELEASE
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("com.victornj.mapper")
public class ProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class, args);
    }

}
