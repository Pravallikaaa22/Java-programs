package com.javaintroduction;

public class Testdemo3 {
	static Testdemo3 t = new Testdemo3();// Object Creation
	static Testdemo3 t1 = new Testdemo3();// Object Creation
	static {
		System.out.println("static block loaded");
	}
	{
		System.out.println("instance block loaded");
	}
	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("main method ended ");

		
	}

}
