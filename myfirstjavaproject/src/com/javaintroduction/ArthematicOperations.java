package com.javaintroduction;

public class ArthematicOperations {
	int a = 5467;
	int b = 198;


	public static void main(String[] args) {
		ArthematicOperations a = new ArthematicOperations();
		a.addition();
		a.subtraction();
		a.multiplication();
		a.division();
		a.modulus();
		

	}
	void addition() {
		int add = a + b;
		System.out.println("Addition"+add);
	}
	void subtraction() {
		int sub = a - b;
		System.out.println("Subtraction:"+sub);
	}
	void multiplication() {
		int mul = a * b;
		System.out.println("multiplication:"+mul);
	}
	void division() {
		double div = a / b;
		System.out.println("Division:"+div);
	}
	void modulus() {
		double mod = a % b;
		System.out.println("Modulus:"+mod);
	}


}
