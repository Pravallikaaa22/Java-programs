package com.javaintroduction;

public class Testlang {
	byte b = 127;
	short s = 3567;
	int i = 986549864;
	long l = 927908657896L;
	float f = 55F;
	double d = 356.67876D;
	char c = 'M';
	boolean boo = true;
    
	

	public static void main(String[] args) {
		Testlang t = new Testlang();
		if(t.boo) {
	    	System.out.println("good morning;");
	    }
		System.out.println(t.b);
		System.out.println(t.s);
		System.out.println(t.i);
		System.out.println(t.l);
		System.out.println(t.f);
		System.out.println(t.d);
		System.out.println(t.c);
		System.out.println(t.boo);


		}

}
