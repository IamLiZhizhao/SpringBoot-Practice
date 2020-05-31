package com.lizhizhao.springboot.practice.controller;

import java.util.UUID;

/**
 * @author lizhizhao
 * @since 2020-05-31 21:02
 */
@RestController
public class PersonController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("insert")
    public String insert() {
        String id = UUID.randomUUID().toString();
        String sql = "insert into person (id,name) values ('"+id+"','lizhizhao')";
        jdbcTemplate.execute(sql);
        return "插入完毕";
    }

}
