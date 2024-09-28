import java.util.Scanner;
class Question_9
{
	public static String reverse(String str ,int i,String rev)
	{
		if(i>=0)
		{
			rev=rev+str.charAt(i);
			return reverse(str,i-1,rev);
		}return rev;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    String ori=str;
		String str2=reverse(str,str.length()-1,"");
		if(ori.equals(str2))
		{
			System.out.println(true);
		}
		else System.out.println(false);
	}
}