import java.util.Scanner;
public class Question_5{
	public static int GCD(int num1,int num2)
	{
		if(num1==0)
		{
			return num2;
		}
		if (num2==0)
		{
			return num1;
		}
		if(num1==num2)
		{
			return num1;
		}
		if(num1>num2)
		{
			return GCD(num1%num2,num2);
		}return GCD(num1,num2%num1);
	}
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	System.out.println(GCD(num1,num2));
}
}