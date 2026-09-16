package com.javaintroduction;

public class Employee {
	static String Companyname = "vcube";
	int empid = 3260;
	String empname = "valli";
	int salary = 1000000;

	public static void main(String[] args) {
		System.out.println("Companyname :" +Companyname);
		Employee e1 = new Employee();
		System.out.println("empid :" +e1.empid);
		System.out.println("empname :" +e1.empname);
		Employee e2 = new Employee();
		System.out.println("empid :" +e1.empid);
		{
			System.out.println("empid :" +e2.empid);
		}
		

	}

}
