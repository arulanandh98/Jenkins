package com.aciwebapp.aciwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.aciwebapp.aciwebapp.controllers.HomeController;

@SpringBootApplication
public class AciwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AciwebappApplication.class, args);
	}

}
