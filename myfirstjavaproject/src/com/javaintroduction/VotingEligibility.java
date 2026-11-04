package com.javaintroduction;

public class VotingEligibility {
	int age = 18;
	boolean indian_citizenship = false;
	boolean voterid = true;
	
	

	public static void main(String[] args) {
		VotingEligibility v = new VotingEligibility();
		if(v.voterid) {
			System.out.println("Person have voter id");
		}else {
			System.out.println("Person doesn't have voter id");
		}
		if(v.indian_citizenship) {
			System.out.println("Indian");
		}else {
			System.out.println("Not an indian");
		}
		if(v.age > 18) {
			System.out.println("Eligible for vote");
		}else if (v.age <= 0) {
			System.out.println("Invalid age");
		}
		else {
			System.out.println("Not eligible for vote");
		}
	

	}

}
