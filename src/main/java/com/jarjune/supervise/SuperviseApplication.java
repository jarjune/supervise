package com.jarjune.supervise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.jarjune.supervise.dao")
public class SuperviseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperviseApplication.class, args);
	}
}
