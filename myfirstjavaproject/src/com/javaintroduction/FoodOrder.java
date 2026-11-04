package com.javaintroduction;

import java.util.Scanner;

public class FoodOrder {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Pizza--->200/-");
	System.out.println("2.Burger--->120/-");
	System.out.println("3.Biryani--->180/-");
	System.out.println("4.noodles--->100/-");
	System.out.println("Select the item:");
	int item = sc.nextInt();
	System.out.println("Enter the quantity:");
	int quantity = sc.nextInt();
	String choice = " ";
	int Price = 0;
	
	switch(item) {
	case 1 ->{
		choice = "Pizza";
		Price = 200;
	}case 2 ->{
		choice = "Pizza";
		Price = 200;
	}case 3 ->{
		choice = "Pizza";
		Price = 200;
	}case 4 ->{
		choice = "Pizza";
		Price = 200;
	}
	default -> System.out.println("Invalid item");
	
	}
	int Total = Price * quantity;
	System.out.println("bill details");
	System.out.println("selected item:"+item);
	System.out.println("Price:"+Price);
	System.out.println("quantity:"+quantity);
	System.out.println("total bill:"+Total);
	
	sc.close();

	}

}
