package com.arrays;

public class Stringarray {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "pravallika";
		names[1] = "valli";
		names[2] = "swetha";
		names[3] = "govind";
		names[4] = "hardik";
		//for(int i = 0; i < names.length; i++) {
		//	System.out.println(names[i]);
		//}
		for(String n : names) {
			System.out.println(n);
		}

	}

}
