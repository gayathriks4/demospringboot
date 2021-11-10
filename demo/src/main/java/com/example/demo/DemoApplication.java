package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.BusinessLayer.CalculateCredit;
import com.example.BusinessLayer.Coursepreview;


@SpringBootApplication
public class DemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CalculateCredit calculateCredit() {
		return new CalculateCredit();
	}
	
	@Bean
	public Coursepreview coursepreview() {
		return new Coursepreview();
	}
	
}
