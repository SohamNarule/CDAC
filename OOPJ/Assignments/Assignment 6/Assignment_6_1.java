package sir.one.Assignment;

import java.util.Scanner;

public class Assignment_6_1 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		for(int i=0;i<arr.length;i++)
		{
			Scanner sc=new Scanner (System.in);
			arr[i]=sc.nextInt();
//			System.out.println(arr[i]);			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);		
		}
		}

}
