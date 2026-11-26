package com.javaoops;
class Vehicle{
	int speed = 50;
	void display() {
		System.out.println("variable speed of vehicle:"+speed);
	}
}
class Car extends Vehicle{
	int car_speed = 100;
	void display() {
		System.out.println("variable speed of car:"+car_speed);
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		
		Vehicle v = new Car();
		System.out.println("main method started");
		v.display();
		System.out.println("main method ended");

	}

}
