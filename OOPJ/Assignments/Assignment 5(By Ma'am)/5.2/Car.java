package Assignment_5_2;
import java.util.Scanner;
public class Car extends Vehicle{
	
	static Scanner sc=new Scanner (System.in);
	protected String Car_Name;
	protected String Car_Type;
	public Car()
	{
		
	}
	public Car(String car_Name, String car_Type,String model_launch_year,String origin_company) {
	    super(model_launch_year, origin_company);
	    Car_Name = car_Name;
		Car_Type = car_Type;
	}
	public String getCar_Name() {
		return Car_Name;
	}
	public void setCar_Name(String car_Name) {
		Car_Name = car_Name;
	}
	public String getCar_Type() {
		return Car_Type;
	}
	public void setCar_Type(String car_Type) {
		Car_Type = car_Type;
	}

	public void accept_record()
	{
		System.out.println("Enter Car Name :  ");
		sc.next();
		setCar_Name(sc.nextLine());
		System.out.println("Enter Car Type :  ");
		setCar_Type(sc.nextLine());
		System.out.println("Enter Car Model Launch Year :  ");
		setModel_launch_year(sc.nextLine());
		System.out.println("Enter Car Origin Company Name  :  ");
		setOrigin_company(sc.nextLine());
		
	}
	public void print_record()
	{
		System.out.println("Enter Car Name :  "+getCar_Name());
		System.out.println("Enter Car Type :  "+getCar_Type());
		System.out.println("Enter Car Model Launch Year :  "+getModel_launch_year());
		System.out.println("Enter Car Origin Company Name  :  "+getOrigin_company());
		
	}
	public static select choise()
	{
		System.out.println("0.Exit\n1.Accept\n2.Print\nEnter Coice: ");
		return select.values()[sc.nextInt()];
	}

}
