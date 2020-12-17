package com.cg.spring.rest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Vaman Deshmukh 
 * @version 1.0
 *
 */

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(App.class, args);
		System.out.println("End");
	}
}
