package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class A {
	
	String name;
	
	int num;
	
	B b;
	
	public A() {
		System.out.println("A cons");
	}
	 
	 public void setB(B b) {
		 this.b = b;
	 }
	 
	 public B getB() {
		 /*Resource resource = new ClassPathResource("applicationContext.xml");
		 BeanFactory bf = new XmlBeanFactory(resource);
		 return (B) bf.getBean("classB");*/
		 return b;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", num=" + num + ", b=" + b + "]";
	}
	 
	
	public void m1() {
		System.out.println("m1");
	}
	
	public void m2() {
		System.out.println("m2");
	}
	 
	
	

}
