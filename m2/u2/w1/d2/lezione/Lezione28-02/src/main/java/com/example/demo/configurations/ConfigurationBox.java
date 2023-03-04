package com.example.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.classes.Box;

@Configuration
public class ConfigurationBox {
	
	@Bean
	public Box box() {
		return new Box(30,10,"box1");
	}
	@Bean
	public Box boxProp() {
		return new Box(40,20);
	}

}
