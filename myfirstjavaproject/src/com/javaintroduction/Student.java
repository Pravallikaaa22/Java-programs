package com.javaintroduction;

public class Student {
	static String Collegename = "Raghu Engineering College";
	String Studentname = "pravallika";
	int Studentid = 9370;
	int Studentmarks = 99;
	public static void main(String[] args) {
		System.out.println("Collegename:"+Collegename);
		System.out.println(Student.Collegename);
		Student s1 = new Student();
		System.out.println("Studentname : " +s1.Studentname);
		System.out.println("Studentid : " +s1.Studentid);
		System.out.println("Studentmarks : " +s1.Studentmarks);
		

	}
		
	
}

	