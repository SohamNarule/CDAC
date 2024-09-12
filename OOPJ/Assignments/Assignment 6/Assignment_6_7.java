//7.Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor. Define methods named acceptRecord and printRecord within the class and test their functionality
package sir.Seven.Asiignment;

import java.util.Scanner;

class Call{
	Scanner sc =new Scanner (System.in);
    int n =sc.nextInt();
	
	int arr[]=new int[n];
		  
	  public void aceeptrecord()
	   {
		   for (int i=0;i<this.n;i++)
		   {
			  arr[i]=sc.nextInt();
		   }
	   }
	  public void printrecord()
	   {
		   for (int i=0;i<this.n;i++)
		   {
			   System.out.println(arr[i]+" ");
		   }
	   }
    }
public class Assignment_6_7 {

public static void main(String[] args)
{
	Call c=new Call();
	c.aceeptrecord();
	c.printrecord();
}

}
