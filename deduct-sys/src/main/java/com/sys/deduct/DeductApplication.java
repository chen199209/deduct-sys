package com.sys.deduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication()
@MapperScan("com.sys.deduct.dao")
public class DeductApplication {

	@RequestMapping("/")
	public String index(){
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(DeductApplication.class, args);
	}
}
