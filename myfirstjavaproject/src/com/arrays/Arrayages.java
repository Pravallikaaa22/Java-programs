package com.arrays;

public class Arrayages {

	public static void main(String[] args) {
		//declaration
		int[] ages;
		//creation
		ages = new int[10];
		//initialize
		ages[0] = 22;
		ages[1] = 21;
		ages[2] = 20;
		ages[3] = 22;
		ages[4] = 21;
		ages[5] = 20;
		ages[6] = 25;
		ages[7] = 22;
		ages[8] = 23;
		ages[9] = 25;
		//representation
		// using for loop
	//	for (int i = 0; i < ages.length; i++) {
	//		System.out.println(ages[i]);
	//	}
		// using for each loop
		System.out.println("student ages");
		for(int age:ages) {
			System.out.println(age);
		}
		
		

	}

}
