package com.lizhizhao.springboot.practice;

import com.lizhizhao.springboot.practice.service.ProviderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");
		ProviderService providerService=context.getBean(ProviderService.class);
		System.out.println(providerService.SayHello("hello world!"));
	}

}
