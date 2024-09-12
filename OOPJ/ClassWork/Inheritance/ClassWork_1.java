package practice.Inheritance;

import java.util.Scanner;

public class ClassWork_1 {
	public static Scanner sc = new Scanner (System.in);
	public static void accept_record(Volume volume)
	{
		if (volume instanceof Cylinder)
		{
			Cylinder Cy =(Cylinder) volume;
			System.out.println("Enter the redius of cylinder");
			Cy.setRadius(sc.nextFloat());
			System.out.println("Enter the Hight of cylinder");
			Cy.setHight(sc.nextFloat());
			
		}else if (volume instanceof Cube)
		{
			Cube Cy =(Cube) volume;
		System.out.println("Enter the Side of Cube");
		Cy.setSide(sc.nextFloat());
		
			
		}else if (volume instanceof Sphere)
		{
			Sphere Cy =(Sphere) volume;
			System.out.println("Enter the redius of Sphere");
			Cy.setRadius(sc.nextFloat());
		}
	}
	public static void printRecord(Volume volume)
	{
		System.out.println("Volume    :"+volume.getVolume());
		System.out.println("--------------------------");
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Volume of Cylinder    :");
		System.out.println("2.Volume of Cube        :");
		System.out.println("3.Volume of Sphere      :");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int ch;
		while ((ch = ClassWork_1.menuList())!=0) 
	    {
			Volume volume =null;
		switch (ch) {
		case 1:
			volume = new Cylinder();
			break;
		case 2:
			volume = new Cube();
			break;
		case 3:
			volume = new Sphere();
			break;

		default:
			break;
		}if (volume !=null) {
		ClassWork_1.accept_record(volume);
		volume.calculateVolume();
		ClassWork_1.printRecord(volume);
		}
		}
	
	}

}
