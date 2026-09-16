package com.javaintroduction;

public class Testdemo1 {
	static int a = 10;
	static {
		System.out.println("static block1 loaded");
	}
	static {
		System.out.println("static block2 loaded");
	}


	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(a);
		}
	static {
		System.out.println("static block3 loaded");
	}


}
