package com.lizhizhao.springboot.practice.exception;

import com.lizhizhao.springboot.practice.enums.ErrorCodeEnum;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseException extends RuntimeException {
    private final ErrorCodeEnum error;
    private final HashMap<String, Object> data = new HashMap<>();

    public BaseException(ErrorCodeEnum error, Map<String, Object> data) {
        super(error.getMessage());
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    protected BaseException(ErrorCodeEnum error, Map<String, Object> data, Throwable cause) {
        super(error.getMessage(), cause);
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    public ErrorCodeEnum getError() {
        return error;
    }

    public Map<String, Object> getData() {
        return data;
    }

}