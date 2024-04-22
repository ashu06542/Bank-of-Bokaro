package com.bank.BankOfBokaro;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankOfBokaroApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankOfBokaroApplication.class, args);
	}

	@Bean
	ModelMapper mapper() {
		
		return new ModelMapper();
	}
}
