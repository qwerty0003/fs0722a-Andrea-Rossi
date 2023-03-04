package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.example.demo.classes.Box;
import com.example.demo.configurations.ConfigurationBox;

@SpringBootApplication
public class Lezione2802Application {

	public static void main(String[] args) {
		SpringApplication.run(Lezione2802Application.class, args);
		
		appBeanBox();
	}
	
	public static void appBeanBox() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationBox.class);

		//recupero bean
		Box b1 = (Box) appCtx.getBean("box");
		System.out.println(b1.getArea());
		System.out.println(b1.getPerimeter());
		System.out.println(b1.getName());
		//recupero bean
		Box b2 = (Box) appCtx.getBean("boxProp");
		System.out.println(b2.getArea());
		System.out.println(b2.getPerimeter());
		System.out.println(b2.getName());
		
		
		((ConfigurableApplicationContext) appCtx).close();
	}

}
