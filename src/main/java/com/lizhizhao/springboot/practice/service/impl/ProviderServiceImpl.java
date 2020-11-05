package com.lizhizhao.springboot.practice.service.impl;

import com.lizhizhao.springboot.practice.service.ProviderService;

/**
 * xml方式服务提供者实现类
 */
public class ProviderServiceImpl implements ProviderService {

    public String SayHello(String word) {
        return word;
    }

}