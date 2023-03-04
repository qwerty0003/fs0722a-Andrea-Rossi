package com.example.Lezione01_03.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.Lezione01_03.classes.Box;

@Configuration
@PropertySource("classpath:application.properties")
public class BoxConfig {
	
	@Value("${box.x}") private int x;
	@Value("${box.y}") private int y;
	@Value("${box.nome}") private String nome;
	
	@Bean
	public Box box() {
		return new Box(30,10,"Box1");
	}

	
	@Bean
	public Box boxAppProp() {
		Box b = new Box();
		b.setX(x);
		b.setY(y);
		b.setName(nome);
		return b;
	}
}
