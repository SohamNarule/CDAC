package Assignment_5_3;

import java.util.Scanner;

public class Animal_Info {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("Slect Aniamal\n1.Dog\n2.Lion");	
	select ch = select.values()[sc.nextInt()];  
	System.out.println(ch);
	Animal A=null;
	//While(ch!=select.Exit)
	{
		switch(ch) {
		case Dog:
		{
			A = new Dog();//upcasting
		}  break;
		case Lion:
		{	
			A = new Lion(); //upcasting 		
		}
		break;
	  }
	}
	
	if(A!=null) {
		A.animaltype();// it will call overridden methods
		A.soundmake();
	}
		sc.close();
	}

}
