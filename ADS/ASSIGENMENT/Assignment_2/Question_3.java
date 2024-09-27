import java.util.Scanner;
public class Question_3 
{
	public static String spaceremove(String str)
	{
			String str2= str.replaceAll("\\s","");	
				return str2;
	}
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
 System.out.println(spaceremove(str));
}
}