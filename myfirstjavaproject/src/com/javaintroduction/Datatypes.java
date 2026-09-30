package com.javaintroduction;

public class Datatypes {
	Integer studentid = 33;
	String name = "valli";
	Integer age = 20;
	Double marks = 99D;
	Character grade = 'A';
	Boolean passed = true;
	

	public static void main(String[] args) {
		Datatypes d = new Datatypes();
		if(d.passed) {
			System.out.println("passed");
		}
		System.out.println(d.studentid);
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.marks);
		System.out.println(d.grade);
		
		
		
		
		

	}

}
