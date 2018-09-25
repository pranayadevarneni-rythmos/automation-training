package com.training.one;

public class TestConstructor {
	
	String name;
	String depart;
	int id;
	
	public TestConstructor(String name, String depart) {
		this.name = name;
		this.depart = depart;
	}
	
	public TestConstructor() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return this.name;
	}
	

	
	public static void main(String[] args) {
		TestConstructor test = new TestConstructor();
		test.setName("Test");
		System.out.println(test.getName());
	//	System.out.println(new TestConstructor("Pravin", "Testing").getName());
		
	}
}
