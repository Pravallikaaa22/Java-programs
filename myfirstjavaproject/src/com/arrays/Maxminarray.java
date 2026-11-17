package com.arrays;

public class Maxminarray {

	public static void main(String[] args) {
		int[] numbers = {7,4,3,1,18,45,33,9,99};
		int min = numbers[0];//7
		int max = numbers[0];//7
		for(int n : numbers) {
			if(n < min) {
				min = n;
			}else if (n > max) {
				max = n;
			}
		}
		
		
		
		
		
		System.out.println("min number:"+min);
		System.out.println("max number:"+max);
		

	}

}
