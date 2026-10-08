package com.javaintroduction;

public class Studentdetails {
	Integer stid = 5346;
	Integer marks = 100;
	Boolean pass = true;
	//auto boxing
	int stid1 = 234;
	Integer stid2 = stid1;
	//auto un-boxing
	int marks1 = marks;
	
	

	public static void main(String[] args) {
		Studentdetails s = new Studentdetails();
		if(s.pass) {
			System.out.println("student passed");
		}else {
			System.out.println("student failed");
		}
		System.out.println(s.stid);	
		System.out.println(s.stid1);	
		System.out.println(s.stid2);	
		System.out.println(s.marks);
		System.out.println(s.marks1);
		System.out.println(s.pass);
		
		}

}
