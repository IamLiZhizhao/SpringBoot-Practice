package com.lizhizhao.springboot.practice.dto;

/**
 * 子类
 *
 * @author lizhizhao
 * @since 2021-02-06 16:46
 */
public class ChildDTO extends ParentDTO{

    private static String initStatus = "子类静态变量";

    private String cid;

    static {
        System.out.println("子类静态代码块");
    }

    public ChildDTO (){
        System.out.println("子类构造函数");
    }

    public ChildDTO (String cid){
        this.cid = cid;
        System.out.println("子类构造函数");
    }

    private void print() {
        System.out.println("子类实例方法");
    }

}
