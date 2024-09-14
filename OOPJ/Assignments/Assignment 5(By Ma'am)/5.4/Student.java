package Assignment_5_4;

import java.util.Scanner;

public class Student extends ClassRoom {
	Scanner sc=new Scanner (System.in);
 public void Entry()
 {
	 System.out.println("Enter The name of student");
	 setStdName(sc.nextLine());
	 System.out.println("Enter The age of student");
	 setAge(sc.nextInt());
	 System.out.println("Enter The Id of student");
	 setRollNo(sc.nextInt());	 
 }
@Override
public String toString() {
	String str= "Student [stdName=" + stdName + ", age=" + age + ", rollNo=" + rollNo + "]";
	return str;
} 
}
