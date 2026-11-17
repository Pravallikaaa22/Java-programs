package com.arrays;

public class Studentmarks {

	public static void main(String[] args) {
		int[] marks = {99,98,97,96,95,94};
		int sum = 0;
		double avg = 0;
		//for(int i = 0; i < marks.length; i++) {
		//	sum = sum + marks[i];
		//}
		for (int m : marks) {
			sum += m;
		}
		avg = sum / marks.length;
			
		
		
		System.out.println("sum of marks:"+sum);
		System.out.println("avg of marks:"+avg);
		
		

	}

}
