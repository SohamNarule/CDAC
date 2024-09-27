import java.util.*;
public class Question_7
{
	public static void dup(String str)
	{
		char temp=0;
		ArrayList<Character> arr= new ArrayList<Character>(str.length());
		for(int i=0;i<str.length();i++)
		{
		  arr.add(str.charAt(i));
		}
		ArrayList<Character> dup =new ArrayList<Character>();
		
		HashSet<Character> set =new HashSet<Character>();
		for(Character ch:arr)
		{
			if(set.contains(ch))
			{
				dup.add(ch);
			}else 
				{
				   set.add(ch);
				}
		}
		for(Character ch :dup)
		{
			System.out.print(ch+" ");
		}
	}	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	dup(str);
}
}
	