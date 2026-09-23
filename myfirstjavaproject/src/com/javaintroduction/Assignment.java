package com.javaintroduction;

public class Assignment {
	static int country_id = +91;
	static String country_name = "India";
	long Phone_number;
	String Name;
	void hello() {
		System.out.println("Employee details");
	}

	public static void main(String[] args) {
		Assignment a1 = new Assignment();
		a1.hello();
		System.out.println(Assignment.country_id);
		System.out.println(Assignment.country_name);
		a1.Phone_number = 98570865789L;
		a1.Name = "valli";
		System.out.println(a1.Name);
		System.out.println(a1.Phone_number);
	
	}

}
