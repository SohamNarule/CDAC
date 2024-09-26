import java.util.Scanner;
public class Question_3{
	public static int fact(int num){
		if(num==0)return 1;
		else 
			return num * fact(num-1);
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(fact(num);
	}
}