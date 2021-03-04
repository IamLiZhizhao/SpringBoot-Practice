package com.lizhizhao.springboot.practice.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 测试DTO
 *
 * @author lizhizhao
 * @since 2021-03-03 17:05
 */
@Configuration
public class ConfigTest1DO {

    @Value("${test1.name}")
    private String name;

    @Value("${test1.age}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
