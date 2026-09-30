package com.javaintroduction;

public class Convert {
	int i = 234;
	int i1 = (int)76568098768964676578678D;
	double d = 7656809876896467657D;
	double d1 = i;
	char c = 'm';
	char c1 = 98;
	char c2 = (int)'1';
	int i2 = (char)'P';
	

	public static void main(String[] args) {
		Convert b = new Convert();
		System.out.println("int:"+b.i);
		System.out.println("int to double:"+b.i1);
		System.out.println("double to int:"+b.d1);
		System.out.println("char:"+b.c);
		System.out.println("int to char:"+b.i2);
		System.out.println("place int in char:"+b.c1);
		System.out.println("char to int:"+b.c2);
		
		
		

	}

}
