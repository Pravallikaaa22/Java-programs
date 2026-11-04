package com.javaintroduction;

public class MobileBill {
	String model;
	int quantity;
	double price;
	double delivery_charge;
	double mobile_price;
	double final_bill;
	MobileBill(){
		this("A23");
	}
	MobileBill(String model){
		this(model,1);
	}
	MobileBill(String model,int quantity){
		this(model,quantity,27000);
	}
	MobileBill(String model,int quantity,double price){
		this(model,quantity,price,270);
	}
	MobileBill(String model,int quantity,double price,double delivery_charge){
		this.model = model;
		this.quantity = quantity;
		this.price = price;
		this.delivery_charge = delivery_charge;
		this.mobile_price = this.quantity * this.price;
		this.final_bill = this.price + this.delivery_charge;
	}
	
	
	

	public static void main(String[] args) {
		MobileBill m = new MobileBill ();
		m.mobileinfo();
		
		

	}
	void mobileinfo() {
		System.out.println("model of mobile:"+model);
		System.out.println("quantity of mobile:"+quantity);
		System.out.println("price of mobile:"+price);
		System.out.println("delivery_charge of mobile:"+delivery_charge);
		System.out.println("mobile price:"+mobile_price);
		System.out.println("fianl_bill:"+final_bill);
		
	}

}
