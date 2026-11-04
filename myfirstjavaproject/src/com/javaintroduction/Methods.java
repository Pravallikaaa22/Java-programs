package com.javaintroduction;

public class Methods {
	int a = 10;
	int b = 20;
	int sum;
	int add;
	int marks;
	int marks1;
	//no return type no parameters;
  void marks() {
		sum = a + b;
		System.out.println("marks:"+sum);
	}
  //no return type with parameters
  void add(int c,int d) {
	  int sum1 = c + d;
	  System.out.println("marks:"+sum1);
  }
  //with return type no parameters
  int mathsmarks() {
	  marks = 100;
	  return marks;
  }
  //with return type with parameters
  int sciencemarks(int a,int b) {
	  marks = a + b;
	  return marks;
  }

	public static void main(String[] args) {
		Methods m = new Methods();
		m.marks();
		m.add(40,10);
		int marks =m.mathsmarks();
		System.out.println("marks:"+marks);
		int marks1 = m.sciencemarks(60,10);
		System.out.println("marks:"+marks1);

	}

}
