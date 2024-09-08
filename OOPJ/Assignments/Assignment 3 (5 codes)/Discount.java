package org.shop;

import java.util.Scanner;

class DiscountCalculator{
	public int op;
	public float da;
	public int fa;
	public float rate;
	Scanner sc=new Scanner (System.in);
	public void accept_record()
	{
		System.out.print("Enter The Original Price:");
		this.op=sc.nextInt();
		System.out.print("Enter The Discount Rate :");
		this.rate=sc.nextFloat();
		
	}
	public void calculat_Discount()
	{
		this.da=this.op*this.rate/100;
		this.fa=this.op-(int)this.da;
	}
	public void print_record()
	{
		System.out.println("The Final Amount is: "+this.fa);		
	}
}
public class Discount {

	public static void main(String[] args) {
		
		DiscountCalculator D = new DiscountCalculator();
		D.accept_record();
		D.calculat_Discount();
		D.print_record();
		
	}

}
