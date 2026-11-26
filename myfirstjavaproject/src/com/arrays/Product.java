package com.arrays;

import java.util.Arrays;

public class Product {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		int [] rem = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			int product = 1;
			for(int j = 0; j < arr.length; j ++) {
				if(i != j) {
					product = product * arr[j];
				}
			}
			rem[i] = product;

			
		}
		
		System.out.println(Arrays.toString(rem));
	

	}

}
