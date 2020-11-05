package com.lizhizhao.springboot.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonSource  {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    // getters/setters omiited
}