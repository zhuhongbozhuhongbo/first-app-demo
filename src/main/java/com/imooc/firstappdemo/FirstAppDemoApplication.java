package com.imooc.firstappdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imooc.firstappdemo.dao")
public class FirstAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppDemoApplication.class, args);
	}
}
