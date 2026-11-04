package com.javaintroduction;

public class Methodnrnp {
//no return type no parameter
	
	
	
//Write a method to print "Hello World".
	String name;
	void hello() {
		System.out.println("Hello World!!");
	}
//Write a method to print your name.
	void name() {
		name = "Pravallika";
		System.out.println("My name is "+name);
		
	}
//Write a method to print your college name.
	void college() {
		String name1 = "Raghu institue of technology";
		System.out.println("My college name is "+name1);
	}
//Write a method to print your branch name.
	void branch() {
		System.out.println("My branch is ece");
	}
//Write a method to print your age.
	void age() {
		System.out.println("My age is secret");
	}
//Write a method to print "Welcome to Java".
	void welcome() {
		System.out.println("welocme to java");
	}
//Write a method to print 1 to 10.
	void numbers() {
		System.out.println("Numbers 1 to 10:");	
		for (int i = 1; i <= 10; i++) {
		System.out.println(i);	
		}
		
	}
	public static void main(String[] args) {
		Methodnrnp m = new Methodnrnp();
		m.hello();
		m. name();
		m.college();
		m.branch();
		m.age();
		m.welcome();
		m.numbers();


	}

}
