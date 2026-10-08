package com.javaintroduction;

public class Convert {
	int i = 234;
	double d = i;
	double d1 = 7656809876896467657D;
	int i1 = (int)d1;
	char c = 'm';
	int i2 = (int)c;
	int i3 = 65;
	char c1 = (char)i3;
	

	public static void main(String[] args) {
		Convert b = new Convert();
		System.out.println("int:"+b.i);
		System.out.println("int to double:"+b.d);
		System.out.println("double:"+b.d1);
		System.out.println("double to int:"+b.i1);
		System.out.println("char:"+b.c);
		System.out.println("char to int:"+b.i2);
		System.out.println("int:"+b.i3);
		System.out.println("int to char:"+b.c1);
		
		
		

	}

}
