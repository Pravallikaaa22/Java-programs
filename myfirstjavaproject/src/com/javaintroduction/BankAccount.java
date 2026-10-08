package com.javaintroduction;

public class BankAccount {
	static int balance = 1000;

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposite(500);
		b.withdraw(300);

	}
	void deposite(int amount) {
		balance = balance + 500;
		System.out.println("Congratulations you have deposited the amount of "+balance );
	}
	void withdraw(int amount) {
		balance = balance - 300;
		System.out.println("Total balance after withdraw is "+balance);
	}

}
