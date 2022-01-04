package com.naresh.test;

import java.time.LocalDate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.naresh.A;
import com.naresh.CollectionExample;
import com.naresh.PropertyReadExample;

public class Test {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory bf = new XmlBeanFactory(resource);
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\Eclipse\\Anil\\spring-core1\\src\\main\\resources\\applicationContext.xml");
		/*A a = (A) bf.getBean("a");
        System.out.println(a);*/
		
		/*CollectionExample ce = (CollectionExample) bf.getBean("days");
		System.out.println(ce);*/
		/*PropertyReadExample pre = (PropertyReadExample) ctx.getBean("pre");
		System.out.println(pre);*/
		
		/*CollectionExample ce = (CollectionExample) bf.getBean("ce");
		System.out.println(ce);*/
		
		//Circular Dependency
		A a = (A) bf.getBean("a");
	}

}
