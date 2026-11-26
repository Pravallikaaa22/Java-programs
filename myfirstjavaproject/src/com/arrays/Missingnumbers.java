package com.arrays;

public class Missingnumbers {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 5 };
		int n = 5;
		int total = n * (n + 1) / 2;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println(total - sum);

	}

}
