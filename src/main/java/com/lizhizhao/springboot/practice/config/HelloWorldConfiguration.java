package com.lizhizhao.springboot.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String hello() {
        return "hello world";
    }
}