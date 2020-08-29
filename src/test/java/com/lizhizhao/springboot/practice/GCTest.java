package com.lizhizhao.springboot.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GCTest {

	@Test
	public void main() {
		byte[] allocation1, allocation2;
		allocation1 = new byte[30900*1024];
		allocation2 = new byte[900*1024];
	}
}