package com.lsj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lsj.mapper")
public class LsjApplication {

	public static void main(String[] args) {
		SpringApplication.run(LsjApplication.class, args);
	}

}

