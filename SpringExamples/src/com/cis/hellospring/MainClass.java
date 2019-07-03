package com.cis.hellospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainClass {
	static ApplicationContext ac;
	static BeanFactory bf;
	public static void main(String args[]){
		ac=new ClassPathXmlApplicationContext("file:spring-config.xml");
		bf=new XmlBeanFactory(new FileSystemResource("spring-config.xml"));
		HelloSpringBean hsb = (HelloSpringBean) bf.getBean("HelloWorldBeanSb");
		HelloSpringBean hsb2 = (HelloSpringBean) ac.getBean("HelloWorldBeanAc");
		System.out.println(hsb.getMessage());
		System.out.println(hsb2.getMessage());
		hsb.setMessage("singleton try");
		hsb2.setMessage("Prototype try");
		HelloSpringBean hsb3 = (HelloSpringBean) bf.getBean("HelloWorldBeanSb");
		HelloSpringBean hsb4 = (HelloSpringBean) ac.getBean("HelloWorldBeanAc");
		System.out.println(hsb3.getMessage());
		System.out.println(hsb4.getMessage());
	}
}
