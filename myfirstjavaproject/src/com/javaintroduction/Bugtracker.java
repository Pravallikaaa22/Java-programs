package com.javaintroduction;

public class Bugtracker {
	int Bugid;
	String Applicationname;
	String Bugtitle;
	String Severity;
	String Priority;
	String Status;
	String Assigneddeveloper;
	
	

	public static void main(String[] args) {
	Bugtracker b = new Bugtracker();
	Bugtracker b1 = new Bugtracker();
	b.Bugid = 01;
	b.Applicationname = "emp_portal";
	b.Bugtitle = "null pointer exception";
	b.Severity = "Critical";
	b.Priority = "Low";
	b.Status = "open";
	b.Assigneddeveloper = "valli";
	b.getBugid();
	b.getApplicationanme();
	b.getBugtitle();
	b.getSeverity();
	b.getPriority();
	b.getStatus();
	b.getUpdatedeveloper(01,"ushasri");
	b.getAssigneddeveloper();
	b1.Bugid = 02;
	b1.Applicationname = "patient_portal";
	b1.Bugtitle = "null pointer exception";
	b1.Severity = "Critical";
	b1.Priority = "high";
	b1.Status = "open";
	b1.Assigneddeveloper = "Pravallika";
	b1.getBugid();
	b1.getApplicationanme();
	b1.getBugtitle();
	b1.getSeverity();
	b1.getPriority();
	b1.getStatus();
	b1.getAssigneddeveloper();
	}
	void getBugid() {
		System.out.println("The Bugid is:"+Bugid);
	}
	void getApplicationanme() {
		System.out.println("The Applicationname is:"+Applicationname);
	}
	void getBugtitle() {
		System.out.println("The Bugtitle is:"+Bugtitle);
	}
	void getSeverity() {
		System.out.println("The Severity is:"+Severity);
	}
	void getPriority() {
		System.out.println("The Priority is:"+Priority);
	}
	void getStatus() {
		System.out.println("The Status is:"+Status);
	}
	void getAssigneddeveloper() {
		System.out.println("The Assigneddeveloper is:"+Assigneddeveloper);
	}
	void getUpdatedeveloper(int Bugid1,String Newdeveloper) {
		Bugid=Bugid1;
		Assigneddeveloper=Newdeveloper;
	}

}
