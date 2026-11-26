package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Stringelement {

	public static void main(String[] args) {
		String[] names = new String [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		
		 for ( int i = 0; i < names.length; i++) {
			 names[i] = sc.next();
		 }
		 System.out.println(Arrays.toString(names));
		 sc.close();

	}

}
