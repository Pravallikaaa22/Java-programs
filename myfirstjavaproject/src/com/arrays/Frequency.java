package com.arrays;

public class Frequency {

	public static void main(String[] args) {
		int[] arr = { 1,2,1,3,1,2,3,4,5,6,1,4,2};
		boolean[] visit = new boolean[arr.length];
		for(int i = 0; i < arr.length; i++) {
			int c = 0;
			if (visit[i]) {
				continue;
			}
			for (int j = i; j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					visit[j] = true;
					c++;
				}
			}
			System.out.println(arr[i]+"->"+c);
		}
		

	}

}
