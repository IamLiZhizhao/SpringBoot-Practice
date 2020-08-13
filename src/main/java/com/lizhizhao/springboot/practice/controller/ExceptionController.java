package com.lizhizhao.springboot.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/illegalArgumentException")
    public void throwException() {
        throw new IllegalArgumentException();
    }

//    @GetMapping("/resourceNotFoundException")
//    public void throwException2() {
//        throw new ResourceNotFoundException();
//    }

    @GetMapping("/noSuchFieldException")
    public void throwException3() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, No Such Field!", new NoSuchFieldException());
    }
}