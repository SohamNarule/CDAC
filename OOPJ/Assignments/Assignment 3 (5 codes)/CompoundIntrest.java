package org.hdfcbank;

import java.util.Scanner;
import java.lang.Math;
class CompoundInterestCalculator{
	public int P;
	public float rate;
	public int numberofcompounds;
	public int year;
	public float totalInt;
	public double futureValue;
	Scanner sc = new Scanner (System.in);
	public void acceptRecord(){
		System.out.println("Enter Principle Amount: ");
		this.P=sc.nextInt();
		System.out.println("Enter Intrest Rate 	  : ");
		this.rate=sc.nextFloat();
		System.out.println("Enter Number of Compounds : ");
		this.numberofcompounds=sc.nextInt();
		System.out.println("Enter the Duration in year: ");
		this.year=sc.nextInt();		
	}
public void calculateFutureValue(){
		
	this.futureValue=(float)(P*(Math.pow(1+(rate/100*numberofcompounds),(numberofcompounds*year))));
	this.totalInt=(float)futureValue-P;		
	}
public void printRecord(){
	System.out.println("The Future Value is: "+(float)this.futureValue);
	System.out.println("The Total Intrest is: "+this.totalInt);
	
	}
}public class CompoundIntrest {

	public static void main(String[] args) {
		CompoundInterestCalculator cic =new CompoundInterestCalculator();
		cic.acceptRecord();
		cic.calculateFutureValue();
		cic.printRecord();

	}

}
