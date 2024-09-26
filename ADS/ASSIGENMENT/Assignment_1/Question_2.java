//Question 2
import java.util.Scanner;
public class Question_2
{
	static Scanner sc=new Scanner(System.in);
	public static boolean prime (int num,int i)
	{
			if(num==0 || num==1)
			{
				return false;
			}
			else if(i<num||num==2)
			{
				if(num%i!=0||num==2)
			{
				return true;
			}
			else return false;
			}
			return prime(num,i+1);
	}
	
	public static void main(String args[])
	{
		int num=sc.nextInt(); //10
		System.out.println(prime(num,2));//10 ,2
	}
}