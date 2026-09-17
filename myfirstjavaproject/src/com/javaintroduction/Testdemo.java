package com.javaintroduction;

public class Testdemo {
	static void method() {
		method2();
		System.out.println("method1 called!!");
	}
	static void method2() {
		method3();
		System.out.println("method2 called!!");
	}
	static void method3() {
		System.out.println("method3 called!!");
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		Testdemo.method();
		

		

	}

}
