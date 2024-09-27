import java.util.*;
public class Question_4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		
		
	System.out.println(reverse(s,s.length()-1,""));
	
	}
	public static String reverse(String s,int i,String rev)
	{
		
		
		if(i>=0){

			rev=rev+s.charAt(i);
			return reverse(s,i-1,rev);
			
		}return rev;
		
}
}