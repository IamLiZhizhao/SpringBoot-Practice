package com.lizhizhao.springboot.practice.controller;

import java.util.ArrayList;
import java.util.List;

import com.lizhizhao.springboot.practice.dto.Account;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
	
	@RequestMapping("/account")
	public String index(Model m) {
		List<Account> list = new ArrayList<>();
		list.add(new Account("KangKang", "康康", "e10adc3949ba59abbe56e", "超级管理员", "17777777777"));
		list.add(new Account("Mike", "麦克", "e10adc3949ba59abbe56e", "管理员", "13444444444"));
		list.add(new Account("Jane","简","e10adc3949ba59abbe56e","运维人员","18666666666"));
		list.add(new Account("Maria", "玛利亚", "e10adc3949ba59abbe56e", "清算人员", "19999999999"));
        m.addAttribute("accountList",list);
        return "account";
	}
}
