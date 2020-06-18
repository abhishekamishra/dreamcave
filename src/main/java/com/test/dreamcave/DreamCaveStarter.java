package com.test.dreamcave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DreamCaveStarter {

	public static void main(String[] args) {

		SpringApplication.run(DreamCaveStarter.class,args);
		
		System.out.println("Started");
	}

}
