package com.lizhizhao.springboot.practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lizhizhao
 * @since 2020-05-27 12:34
 */

@Entity
@Table(name = "person")
public class PersonDO {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    String id;
}
