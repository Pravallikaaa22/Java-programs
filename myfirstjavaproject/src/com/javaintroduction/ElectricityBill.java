package com.javaintroduction;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Domestic connection");
		System.out.println("2.Commercial connection");
		System.out.println("Enter the connection type:");
		int connection = sc.nextInt();
		System.out.println("no.of.units:");
		int units = sc.nextInt();
	
		int charge=0;
		
		
		
		
		switch(connection) {
		case 1 ->{
			int a = 2;
			int b = 3;
			 charge = (units <= 100)?a:b;
		}
		case 2 ->{
			if (units<=100) {
				 charge= 4;
			}else if(units >= 100 && units <= 300) {
				 charge = 6;
			}else {
				 charge = 8;
			}
			
		}
		
	 }
	int total_bill = units * charge;
	System.out.println("no.of.units:"+units);
	System.out.println("charge:"+charge);
	System.out.println("bill:"+total_bill);
		
		
	sc.close();	

	}
}


