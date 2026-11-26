package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size  = sc.nextInt();
		int [] numbers = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		sc.close();

	}

}
