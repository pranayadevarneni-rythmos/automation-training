package com.training.one;

public class B extends A{
	
	int roll;
	private int rollNumber;
	
	public B() {
		super();
	}
	
	public void setName() {
	System.out.println("B");	
	}
	
	public void setName(String name) {
		System.out.println(name);
	}
	
	public void setName(Object last) {
		
	boolean a = last instanceof C;
	System.out.println(a);
	}
	
	public void printing() {
		this.setName();
		super.setName();
		
	}

	public static void main(String[] args) {
		B b = new B();
		b.printing();

		
	}

}
