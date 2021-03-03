package com.lizhizhao.springboot.practice.dto;

/**
 * 父类
 *
 * @author lizhizhao
 * @since 2021-02-06 16:46
 */
public class ParentDTO {

    //父类静态变量
    //父类静态代码块
    //子类静态变量、
    //子类静态代码块
    //父类非静态变量（父类实例成员变量）
    //父类构造函数
    //子类非静态变量（子类实例成员变量）
    //子类构造函数

    private static String initStatus = "父类静态变量";

    private String pid;

    static {
        System.out.println("父类静态代码块");
    }


    ParentDTO (){
        System.out.println("父类构造函数");
    }

    ParentDTO (String pid){
        this.pid = pid;
        System.out.println("父类构造函数");
    }

    private void print() {
        System.out.println("父类实例方法");
    }

}
