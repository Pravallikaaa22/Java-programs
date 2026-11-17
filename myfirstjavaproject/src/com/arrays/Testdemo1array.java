package com.arrays;

public class Testdemo1array {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,19,18,17,16};
		System.out.println(arr);
		System.out.println(0);
		System.out.println(arr[0]);
		System.out.println("-------------------");
		for(int a:arr) {
			if(a % 2 == 0) {
				System.out.println("even no");
				System.out.println(a);
				}
			if(a % 2 == 1) {
				System.out.println("odd no");
				System.out.println(a);
				}
		}
		

	}
}
