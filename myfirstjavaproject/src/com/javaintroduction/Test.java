package com.javaintroduction;

public class Test {
	int rollno;
	String name;
	int marks;
	static void collegedetails() {
		System.out.println("collegename: raghu");
	}
	
	static {
		System.out.println("collegename:raghu");
	}
	{
		System.out.println("Student object created");
	}
	void hello() {
		System.out.println("Student details");

	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		t1.rollno = 01;
		t1.name = "valli";
		t1.marks = 99;
		t2.rollno = 02;
		t2.name = "sai";
		t2.marks = 99;
		Test.collegedetails();
		System.out.println("rollno :" + t1.rollno);
		System.out.println("name :" + t1.name);
		System.out.println("marks :" + t1.marks);
		System.out.println("rollno :" + t2.rollno);
		System.out.println("name :" + t2.name);
		System.out.println("marks :" + t2.marks);
		
		
		

	}

}
