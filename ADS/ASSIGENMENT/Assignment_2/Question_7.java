import java.util.Scanner;
class Question_7
{
	public static int reverse(int num)
	{
			int rev =0;
		while(num>0){
			int r=num%10;
			
			rev=rev*10+r;
			num=num/10;
		}
		return rev;
	}
	
			
	public static void main (String args[])
	{
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		
		if(num<0)
		{
			num=-1*num;
			System.out.print("-");
			System.out.print(reverse(num));
			
		}else 
		System.out.println(reverse(num));
	}
}