package com.fundamentals.spring_fundamentals_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "/com.fundamentals")
@SpringBootApplication
public class SpringFundamentalsJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFundamentalsJavaApplication.class, args);
	}

}
