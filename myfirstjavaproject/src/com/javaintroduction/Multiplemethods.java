package com.javaintroduction;

public class Multiplemethods {
	String student_name;
	int roll_no;
	String course;
	int s1;
	int s2;
	int s3;
	int total;
	int number_of_subjects;
	float avg;
	void displayStudent_details() {
		System.out.println("student_name:"+student_name);
		System.out.println("student_rollno:"+roll_no);
		System.out.println("student_course:"+course);

	}
	void calculate_total() {
	    total = s1 + s2 + s3;
		System.out.println("total_marks:"+total);
		
	}
	void calculate_average() {
		number_of_subjects = 3;
		avg = total/number_of_subjects;
		total = s1 + s2 + s3;
		System.out.println("total_avg:"+avg);
		
	}


	public static void main(String[] args) {
		Multiplemethods m = new Multiplemethods();
		m.student_name = "valli";
		m.roll_no = 01;
		m.course = "fsj";
		m.s1 = 100;
		m.s2 = 98;
		m.s3 = 99;
		m.displayStudent_details(); 
		m.calculate_total();
		m.calculate_average();

	}

}
