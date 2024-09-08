package org.lonelelo;

import java.util.Scanner;

/*
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method

1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.


Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.
*/

class LoanAmortizationCalculator{
	private float monthlyPayment;
	private int principal;
	private float monthlyInterestRate;
	private int noOfMonths;
	private float annualIntrestrate;
	private int loanTerm;
	Scanner sc =new Scanner (System.in);
	public void  acceptRecord()
	{
		System.out.println("Enter the Loan Amount (Principal Amount):- ");
		this.principal =sc.nextInt();
		System.out.println("Enter the Annual Intrest rate :- ");
		this.annualIntrestrate =sc.nextFloat();
		System.out.println("Enter the year :- ");
		this.loanTerm =sc.nextInt();
	}
	public void calculateMonthlyPayment() 
	{
		this.noOfMonths = loanTerm * 12;
		this.monthlyInterestRate = annualIntrestrate / 12 / 100;
		this.monthlyPayment= (float)(principal * 
				 ((monthlyInterestRate) * 
				 Math.pow((1 + (monthlyInterestRate)),((float)noOfMonths))) 
				 / (Math.pow((1 + (monthlyInterestRate)),((float)noOfMonths)) - 1));
	}
	public void printRecord() 
	{
		System.out.println("Monthly payment :-"+this.monthlyPayment);
	}	
}
public class LoneAmortization {

	public static void main(String[] args) {
		
		LoanAmortizationCalculator lac=new LoanAmortizationCalculator();
		lac.acceptRecord();
		lac.calculateMonthlyPayment();
		lac.printRecord();
	}

}
