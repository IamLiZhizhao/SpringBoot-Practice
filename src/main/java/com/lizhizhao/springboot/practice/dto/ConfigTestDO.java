package com.lizhizhao.springboot.practice.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 测试DTO
 *
 * @author lizhizhao
 * @since 2021-03-03 17:05
 */
@ConfigurationProperties(prefix="test")
@PropertySource("classpath:test.properties")
@Component
public class ConfigTestDO {

    private String name;

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
