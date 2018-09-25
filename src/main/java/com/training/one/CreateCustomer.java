package com.training.one;

public class CreateCustomer {
	
	private String name;
	private String address;
	private String customerType;
	private long phoneNumber;
	
	public String getName() {
		//String rand = String.valueOf(System.currentTimeMillis());
		if(this.name == null) {
			this.name = "Pravin";
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		if(this.address == null) {
			this.address = "Kapil Towers";
		}
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustomerType() {
		if(this.customerType == null) {
			this.customerType = "P";
		}
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public long getPhoneNumber() {
		if(this.phoneNumber == 0) {
			this.phoneNumber = 12345456;
		}
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
