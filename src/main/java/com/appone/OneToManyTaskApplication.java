package com.appone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OneToManyTaskApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext configurableApplicationContext=
		SpringApplication.run(OneToManyTaskApplication.class, args);
	}

}
