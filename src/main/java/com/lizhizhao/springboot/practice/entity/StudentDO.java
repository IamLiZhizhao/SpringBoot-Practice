package com.lizhizhao.springboot.practice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@Getter
@ToString
public class StudentDO {

    String sno; // 学号
    /**
     * 姓名、性别、成绩
     */
    String name;
    String sex;
    BigDecimal score;

    public StudentDO(String sno,String name,String sex,BigDecimal score) {
        this.sno = sno;
        this.name = name;
        this.sex = sex;
        this.score = score;
    }


}