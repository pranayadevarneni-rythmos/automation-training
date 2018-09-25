package com.training.one;

public class One {
	
	int roll;
	static int rollnumber;
	
	
	
	public void printRoll() {
		int roll = 5;
		System.out.println("inide print roll");
		System.out.println(roll);
	}
	
	public static void main(String[] args) {
		One one = new One();
		System.out.println(one.roll);
		one.printRoll();
		System.out.println(One.rollnumber);
	
		//	one.roll = 5;
	
		System.out.println(one.roll);
	}

	
	
}
