package Assignment_5_4;
import java.util.Scanner;
public class School {

	public static void main(String[] args) {
   
   ClassRoom CR =new Student();//upcasting
   Student std = new Student();//downcasting
   std.Entry();
   String str =std.toString();
   System.out.println(str);  
	}

}
