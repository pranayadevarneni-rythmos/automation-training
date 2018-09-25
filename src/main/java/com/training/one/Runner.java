package com.training.one;

public class Runner {

	
	public static void main(String[] args) {
		/*
		Encapsulatioin enc = new Encapsulatioin();
		enc.setFirstName("Pravin");
		enc.setLastName("Lokesh");
		
		System.out.println(enc.getFirstName());
		enc.setFirstName("Testing");

		System.out.println(enc.getFirstName());
		*/
		
		
		CreateCustomer cc = new CreateCustomer();

		CreateCustomer cc1 = new CreateCustomer();

		System.out.println(cc);
		System.out.println(cc1);
		
	//	System.out.println(cc.getAddress().equals(cc1.getAddress()));
		
		System.out.println(cc.equals(cc1));
		cc.setName("Chadan");
		cc.setAddress("Microsoft");
		//SetCreateCustomer(cc);
		
		
		//cc.setName("Rythmos");

	}
	
	public static void SetCreateCustomer(CreateCustomer cc) {
		System.out.println(cc.getName());
		System.out.println(cc.getAddress());
		System.out.println(cc.getPhoneNumber());
		System.out.println(cc.getCustomerType());
		
	}
}
