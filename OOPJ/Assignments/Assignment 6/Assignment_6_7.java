//7.Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor. Define methods named acceptRecord and printRecord within the class and test their functionality
package sir.Seven.Asiignment;

import java.util.Scanner;

class Call{
	int arr[];
	Scanner sc =new Scanner (System.in);
	public Call(int n)
	{
		arr=new int[n];
	}
	public void accept_record(Scanner sc)
	{
		for (int i=0;i<arr.length;i++) {
		System.out.println("Enter the "+(i+1)+" th Element: ");
		arr[i]=sc.nextInt();		
		}
	}
	public void print_record()
	{
		System.out.println("Your ENtered Array is : ");
		for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"  ");		
		}
	}
}
public class Assignment_6_7 {

public static void main(String[] args)
{    Scanner sc =new Scanner (System.in);
	System.out.println("Enter The length of array:  ");
	int L=sc.nextInt();
	Call c=new Call(L);
	c.accept_record(sc);
	c.print_record();
	
}

}
