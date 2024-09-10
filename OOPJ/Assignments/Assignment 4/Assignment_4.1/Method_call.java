package que1.assignment4;

import java.util.Scanner;

public class Method_call {
	int count=0;
	public Method_call() {
		
	    count=count+1;
		System.out.println("Calculation No :"+count);		
	}
	Scanner sc= new Scanner(System.in) ;
	Set_getvalues sg = new Set_getvalues();
	
	public void accept_record()
	{
		System.out.print("Enter the Loan Amount (Principal Amount): ");
		this.sg.setPrincipal(sc.nextInt());
		System.out.print("Enter the Annual Intrest rate : ");
		this.sg.setAnnualIntrestrate(sc.nextFloat());
		System.out.print("Enter the year : ");
		this.sg.setLoanTerm(sc.nextInt());
		
	}
	
	public void printRecord() 
	{
		sg.calculateMonthlyPayment();
		System.out.println("Monthly payment :"+this.sg.getmonthlyPayment());
	
	}
		
	public String toString() {	
		return "Principal: "+this.sg.getPrincipal()+" Lone Term: "+this.sg.getLoanTerm()+" Monthly Intrest Rate: "+this.sg.getMonthlyInterestRate()+" Monthly Payment"+this.sg.getmonthlyPayment();
	}
	public int babu()
	{
		System.out.println("Enter Your Choice\n1.Accept Record \n2.Print Record \n0.Exit");
		int choice=sc.nextInt();
		return choice;
	}

}







