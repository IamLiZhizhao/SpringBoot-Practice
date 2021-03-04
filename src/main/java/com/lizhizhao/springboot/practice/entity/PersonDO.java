//package com.lizhizhao.springboot.practice.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
///**
// * @author lizhizhao
// * @since 2020-05-27 12:34
// */
//
//@Entity
//@Table(name = "person")
//public class PersonDO {
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    String id;
//
//    @Column(name = "user_name", nullable = false, length=32)
//    private String userName;
//
//
//    @Transient //这个字段不被持久化
//    private String secrect;
//}
