package com.training.one;

public class C extends B{

	public C() {
		super();
	}
	
	public void setName() {
		System.out.println("C");
		
	}
	
	
	
	public void print() {
		super.printing();
		this.setName();
		super.setName(new A());
		

	}
	
	public static void main(String[] args) {
	
		ImplementInterface im = new ImplementInterface();
		String name = im.getCarName();
		System.out.println(name);
		
		Impl2 im2 = new Impl2();
		System.out.println(im2.getCarName());
	
	}
	
	
}
