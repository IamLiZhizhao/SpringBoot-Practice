package com.lizhizhao.springboot.practice.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhizhao
 * @since 2020-05-24 12:39
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @ApiOperation(value = "打招呼")
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
}
