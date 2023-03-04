package com.example.demo.SpringBoot_Lezione1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config_bean_XML.TestXML;
import config_bean_component.TestComponent;
import config_bean_configuration.ConfigurationTest;
import config_bean_configuration.Test;

@SpringBootApplication
public class SpringBootLezione1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLezione1Application.class, args);
		
		configWith_Beans();
		configWith_XML();
		configWith_Components();
	}
	
	public static void configWith_Beans() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationTest.class);
		
		
		//recupero bean 
		Test t1 = (Test) appCtx.getBean("test");
		System.out.println(t1.saluta());
		
		//recupero bean con paramentri
		Test t2 = (Test) appCtx.getBean("test2","Giuseppe","Verdi");
		System.out.println(t2.saluta());
		
		((AnnotationConfigApplicationContext) appCtx).close();
	}
	public static void configWith_XML() {
	
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");
		
		//recupero bean
		TestXML t1 = (TestXML) appCtx.getBean("TestXML");
		System.out.println(t1.saluta());
		
		((AnnotationConfigApplicationContext) appCtx).close();
		
	};
	public static void configWith_Components() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext();
		
		//recupero bean
		TestComponent t1 = (TestComponent) appCtx.getBean("TestComponent");
		System.out.println(t1.saluta());
		
		((AnnotationConfigApplicationContext) appCtx).close();
		
	};

}
