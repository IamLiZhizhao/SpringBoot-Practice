package com.lizhizhao.springboot.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author lizhizhao
 * @since 2020-05-31 21:02
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("insert")
    public String insert() {
        String id = UUID.randomUUID().toString().replaceAll("-","");
        String sql = "insert into person (id,name) values ('"+id+"','张三')";
        jdbcTemplate.execute(sql);
        return "插入完毕";
    }

}
