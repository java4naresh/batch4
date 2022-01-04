package com.naresh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.annatations.A;
import com.naresh.annatations.B;

public class Test2 {

	public static void main(String[] args) {
		/*Resource resource = new ClassPathResource("applicationContext2.xml");
		XmlBeanFactory bf = new XmlBeanFactory(resource);
		Customer c = (Customer) bf.getBean("c");
		System.out.println(c.getB());*/
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\Eclipse\\Anil\\spring-core1\\src\\main\\resources\\applicationContext.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		B b = (B) ctx.getBean("b1");
		System.out.println(b);
		A a = (A) ctx.getBean("a1");
		System.out.println(a);
		a.m1();
	}

}
