package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDemoApplication {

	public static void main(String[] args) {
		System.out.println("TestDemoApplication running-----------------------------------");
		SpringApplication.run(TestDemoApplication.class, args);
	}

}
