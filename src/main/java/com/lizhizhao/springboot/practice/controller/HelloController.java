package com.lizhizhao.springboot.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhizhao
 * @since 2020-05-24 12:39
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("hello");
        return "hello";
    }
}
