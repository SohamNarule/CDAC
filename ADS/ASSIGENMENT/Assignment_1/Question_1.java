import java.util.Scanner;
import java.lang.Math;
public class Question_1{
	
	public static int cal(int num ,int l)
	{
		if(num==0)
		{
			return 0;
		}else{	
			int r=num%10;
			int sum=(int)Math.pow(r,l);
			return sum+cal(num/10,l);
			}
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter A Number: ");
		int num=sc.nextInt();
		int temp=num;
		int length=String.valueOf(num).length();
		if(temp==cal(num,length))
		{
			System.out.println("Armstrong Number");
		}else
		System.out.println("not Armstrong Number");
		
	}
}