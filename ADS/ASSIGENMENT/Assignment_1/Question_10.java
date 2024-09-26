import java.util.Scanner;
public class Question_10{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
int num=sc.nextInt();

boolean  W=(num%100==0)?((num%400==0)?true:false):((num%4==0)?true:false);
System.out.println(W);
}
}