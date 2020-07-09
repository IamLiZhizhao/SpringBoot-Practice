package com.lizhizhao.springboot.practice.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizhizhao
 * @since 2020-06-01 18:44
 */
@RequestMapping
@RestController
public class TestController {

    public static void main(String []args){
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(5);
        numList.add(3);
        numList.add(4);
        numList.add(2);
        System.out.println(numList);
        numList.remove(1);
        numList.remove(Integer.valueOf(1));
    }
}
