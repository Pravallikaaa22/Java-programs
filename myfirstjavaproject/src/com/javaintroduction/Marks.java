package com.javaintroduction;
import java.util.Scanner;
public class Marks {
	

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter maths marks");
		double marks  = Sc.nextDouble();
	    System.out.println("your marks:"+marks);
	    maths();
	    System.out.println("enter physics marks");
	    double marks1 = Sc.nextInt();//experiment
	    System.out.println("your marks:"+marks1);
	    physics();
		System.out.println("enter chemistry marks");
		int marks2 = Sc.nextInt();
		System.out.println("your marks:"+marks2);
		chemistry();
	    Sc.close();
	

	}
	static void maths() {
		System.out.println("maths is simple!!");
		}
	static void physics() {
		System.out.println("physics is interesting!!");
		}
	static void chemistry() {
		System.out.println("chemistry is also interesting!!");
		}
	

}
