package com.javaintroduction;

public class LoanManagement {

    String customerName;
    double loanAmount;
    double interestRate;
    int loanTenure;

    double calculateInterest(double loanAmount, double interestRate) {
        double SI = (loanAmount * loanTenure * interestRate) / 100;
        return SI;
    }

    double calculateTotalAmount(double interest) {
        double totalAmount = loanAmount + interest;
        return totalAmount;
    }

    double calculateMonthlyEMI(double totalAmount, int loanTenure) {
        double EMI = totalAmount / (loanTenure * 12);
        return EMI;
    }

    void displayLoanSummary(double interest, double totalAmount, double EMI) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Tenure: " + loanTenure + " years");
        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount Payable: " + totalAmount);
        System.out.println("Monthly EMI: " + EMI);
        
    }

    public static void main(String[] args) {

        LoanManagement m1 = new LoanManagement();

        m1.customerName = "Valli";
        m1.loanAmount = 1000000;
        m1.interestRate = 5;
        m1.loanTenure = 2;

        double interest1 = m1.calculateInterest(m1.loanAmount, m1.interestRate);
        double total1 = m1.calculateTotalAmount(interest1);
        double emi1 = m1.calculateMonthlyEMI(total1, m1.loanTenure);

        m1.displayLoanSummary(interest1, total1, emi1);

        LoanManagement m2 = new LoanManagement();

        m2.customerName = "priya";
        m2.loanAmount = 500000;
        m2.interestRate = 8;
        m2.loanTenure = 3;

        double interest2 = m2.calculateInterest(m2.loanAmount, m2.interestRate);
        double total2 = m2.calculateTotalAmount(interest2);
        double emi2 = m2.calculateMonthlyEMI(total2, m2.loanTenure);

        m2.displayLoanSummary(interest2, total2, emi2);
    }
}

