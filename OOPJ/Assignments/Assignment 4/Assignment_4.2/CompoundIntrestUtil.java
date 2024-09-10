package org.compoundintrest2;

import java.util.Scanner;

public class CompoundIntrestUtil {
//
//	float fa;
//	float ci;
	CompoundIntrestFields CIF =new CompoundIntrestFields();
	Scanner sc =new Scanner(System.in);
	public void accept_record()
	{
		System.out.print("Enter The Principal Value: ");
		CIF.setprincipal(sc.nextInt());
		System.out.print("Enter The Rate of intrest: ");
		CIF.setRate(sc.nextFloat());
		System.out.print("Enter Time duration in year: ");
		CIF.setYear(sc.nextInt());
		System.out.print("Enter Number of compounds: ");
		CIF.setnoofcompounds(sc.nextInt());
	} 

	public void print_record() {
		CIF.finalvaluecalculation();
		System.out.println("Final Amount : "+CIF.getFinal_value());
		System.out.println("Total Intrest: "+CIF.getCompound_intrest());
	}
	public int select()
	{
		System.out.println("0.Exit\n1.Accept Record\n2.Print Record");
		return sc.nextInt();
	}
}