package com.example.Lezione01_03.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.example.Lezione01_03.classes.Box;
import com.example.Lezione01_03.configurations.BoxConfig;

@Component
public class BoxRunner implements CommandLineRunner {
	AnnotationConfigApplicationContext appCtx;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RUNNING...");
		
		appCtx = new AnnotationConfigApplicationContext(BoxConfig.class);
		
		Box b1 = (Box) appCtx.getBean("box");
		System.out.println("Area: "+b1.getArea()+"  Perimetro: "+b1.getPerimeter());
		
		
		appCtx.close();

	}

}
