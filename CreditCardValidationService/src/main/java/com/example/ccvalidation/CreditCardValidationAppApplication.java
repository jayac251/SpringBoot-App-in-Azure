package com.example.ccvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CreditCardValidationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardValidationAppApplication.class, args);
	}

}
