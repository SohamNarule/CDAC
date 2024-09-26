import java.util.Scanner;
public class Question_4
{
		public static int fib(int num)
		{
				if(num<=1) 
				{
					return num;
				}else
				{					
					return fib(num-1)+fib(num-2);
				}
		}
		
		public static void main (String args[])
		{
			Scanner sc=new Scanner (System.in);
			int num=sc.nextInt();
			for(int i=0;i<num;i++)
			{
			System.out.print(fib(i)+" ");
			}
		}
		
}
