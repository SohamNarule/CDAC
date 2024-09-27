 import java.util.Scanner;
 public class Question_1
 {
	 public static int pattern(int num,int i)
	 {
		//for (int i=0;i<num;i++)
			if(i<num)
			{
				for (int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
					System.out.println();
				return pattern(num,i+1);
			}else 
				return 0;  
	 }
	 
	public static void main(String args[] )
	{
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		pattern(num,0);
	}
	
	 
 }
 