import java.util.*;
public class Question_5
{
	public static void reverse(int[] arr,int l)
	{
		int j=0;
		int[] brr=new int[l];
		for(int i=l-1;i>=0;i--)
		{
			brr[j]=arr[i];
			j++;
		}
		for (int i=0;i<l;i++)
		{
		 System.out.print(brr[i]+" ");	
		}
		
	}
	

	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the length"); 
		int l=sc.nextInt();		
		int[] arr =new int[l];
		for (int i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
		reverse(arr,l);
	}
}

