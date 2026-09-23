package com.javaintroduction;

public class Shop {
	static int Total_Cost = 450;
	static int Chocolate_cost = 15;
	static int Cookie_cost = 10;
	int chocolate_bought = 10;
	int cookie_bought = 5;
	int cost = (Chocolate_cost * chocolate_bought) + (Cookie_cost * cookie_bought);
	int Bill = Total_Cost - cost;
		
	public static void main(String[] args) {
		Shop s1 = new Shop();
		System.out.println("Bill:"+s1.Bill);
		

	}

}
