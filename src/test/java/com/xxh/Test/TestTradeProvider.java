package com.xxh.Test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTradeProvider {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider-zk.xml");
		context.start();
		System.out.println("生产者dubbo启动");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
