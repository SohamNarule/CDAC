package org.help;
import java.util.Scanner;
class Calc{
	public float height;
	public float bmi;
	public float weight;
	public float H;	
	public void getdata()
	{
		System.out.println("Enyter Your Height in meter: ");
		Scanner sc = new Scanner (System.in);
		this.height =sc.nextFloat();
		System.out.println("Enyter Your Weight In kg: ");
		this.weight =sc.nextFloat();
		
	}
	public void solve()
	{
		bmi=weight/(height*height);
	}
	public void display ()
	{
		if(bmi<=18.4f)
		{
			System.out.printf("you are Underweight and your Body to Mass ratio is: %.1f",bmi);
		}
		if(bmi>=18.5f && bmi<=24.9f)
		{
			System.out.printf("you are Normal and your Body to Mass ratio is: %.1f",bmi);
		}
		if(bmi>=25.0f && bmi<=29.9f)
		{
			System.out.printf("you are Overweight and your Body to Mass ratio is: %.1f" , bmi);
		}
		if( bmi>30.0)
		{
			System.out.printf("you are Obese and your Body to Mass ratio is: %.1f" , bmi );
		}
	}
}
public class BMI2 {

	public static void main(String[] args) {
		Calc c=new Calc();
		c.getdata();
		c.solve();
		c.display();		
	}

}
