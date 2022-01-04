package com.naresh.annatations;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="a1")
public class A {
	
	@Autowired
	B b;
	
	public void m1() {
		System.out.println(b);
	}
	
	
	public A(B b) {
		this.b = b;
	}
	
	public A() {
		System.out.println(b);
		System.out.println("a const");
		System.out.println(b);
	}

	public B getB() {
		return b;
	}

	
	public void setB(B b1) {
		System.out.println("set B");
		this.b = b1;
	}
	
	@PostConstruct
	public void init() {
		System.out.println(b+"==========");
	}
	
	
}
