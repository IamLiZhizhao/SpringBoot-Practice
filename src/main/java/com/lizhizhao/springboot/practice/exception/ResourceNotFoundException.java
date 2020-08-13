package com.lizhizhao.springboot.practice.exception;

import com.lizhizhao.springboot.practice.enums.ErrorCodeEnum;

import java.util.Map;

public class ResourceNotFoundException extends BaseException {

    public ResourceNotFoundException(Map<String, Object> data) {
        super(ErrorCodeEnum.RESOURCE_NOT_FOUND, data);
    }
}