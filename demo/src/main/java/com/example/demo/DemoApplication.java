package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
//		System.out.println("hello");
//	
//		Class<?> classV = DemoApplication.class;
//		
//		System.out.println("ClassLoader  Actual "+classV.getClassLoader().getClass().getName());
//		
//		System.out.println("Class Loader Padre "+classV.getClassLoader().getParent().getClass().getName());
//		
//		System.out.println("ClassLoader de Araylist "+ArrayList.class.getClassLoader());
		
		
		SpringApplication.run(DemoApplication.class);
		
	}

}
