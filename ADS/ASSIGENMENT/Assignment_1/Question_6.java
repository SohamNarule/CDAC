import java.util.Scanner;
public class Question_6{
	public static float sqrt(float num,float i){
	if (i*i==num)
	{
		return i;
	}else
	if(num==0)
	{
		return 0;
	}else 	
	if(i*i>num)
	{
		return i-0.1f;
	}else 
	return sqrt(num,i+0.1f);
	
}

	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		float num=sc.nextFloat();
		System.out.println(sqrt(num,1.0f));
	}
}