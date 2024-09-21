package ArrayList;
import java.util.*;
class NameComparator implements Comparator<Student>
{
	public int compare(Student obj1,Student obj2)
	{
		return obj1.name.compareTo(obj2.name);
	}
}
class RollComparator implements Comparator<Student>
{
	public int compare(Student obj1,Student obj2)
	{
		return obj1.roll-obj2.roll;
	}
}
class Student implements Comparable<Student> 
{
	public String name;
	public int roll;
	public int age;
	Student(String name ,int roll,int age)
	{
		this.name=name;
		this.roll=roll;
		this.age=age;
	}
	public int compareTo(Student obj)
	{
		return this.roll-obj.roll;
	}
	
	public String toString()
	{
		return "name: "+name+" Roll:"+roll;
	}
}
public class User_Defined {
	public static void display(ArrayList<Student> s)
	{
		if(s==null)return;
		for(Object element : s)
		{
			System.out.println(element);
		}
	}

	
	public static void main(String[] args) {
		ArrayList<Student> std= new ArrayList<>();
		std.add(new Student("Ayus ",360,20)); 
		std.add(new Student("Phara",359,21));
		std.add(new Student("Dipes",361,19)); 
//		display(std);
	    System.out.println("Sort above data ");
		System.out.println("1.Sort by name \n2.Sort by Roll\nEnter Choies:");
		Scanner sc =new Scanner (System.in);
		int ch=5;
		while(( ch=sc.nextInt())!=0) 
		{
			switch(ch)
			{
				case 1:
					  Collections.sort(std,new NameComparator());
					   display(std);
					   break;
				case 2:
					  Collections.sort(std,new RollComparator());
				      
				       break;
			}
			display(std);
		}
	}
}
