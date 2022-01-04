package com.naresh;

public class Customer {
	
	Bank b;
	
	A a;
	
	

	public Customer(Bank b, A a) {
		System.out.println("Costomer Cunst");
		this.b = b;
		this.a = a;
	}

	public Bank getB() {
		return b;
	}

	public void setB(Bank b) {
		System.out.println("setter B");
		this.b = b;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		System.out.println("setA");
		this.a = a;
	}
	
	

}
