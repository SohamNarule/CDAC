//Factorial
public class Factorial{
	
	static int fact(int n )
	{
		if (n==1)
		{
			return 1;
		}
		
		return n*fact(n-1);
		
		
	}
		
	public static void main(String args[])
	{
		int F=5;
		System.out.println(fact(F));
		
	}
}
