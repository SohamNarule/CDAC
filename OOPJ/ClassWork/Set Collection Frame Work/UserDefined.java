package HashSet;
import java.util.*;
class NameComparator implements Comparator<Shape>
{
	public int compare(Shape sh1,Shape sh2)
	{
		return sh1.name.compareTo(sh2.name);
	}

	
}
class PerimeterComparator implements Comparator<Shape>
{
	public int compare(Shape sh1,Shape sh2)
	{
		return sh1.perimeter-sh2.perimeter;
	}
}
class Shape implements Comparable<Shape>{
	public String name;
	public int area;
	public int perimeter;
	Shape(String name,int area ,int perimeter)
	{
		this.name =name ;
		this.area =area ;
		this.perimeter =perimeter;
	}
	public int compareTo(Shape sh)
	{
		return this.area-sh.area; 
	}
	@Override 
	public String toString()
	{
		return "Shape Name: "+name+"\nArea Of Shape: "+area+"\nPerimeter of Shape: "+perimeter;
	}
}
public class UserDefined {
   
	public static void print(List<Shape> sh)
	
	{
		for(Shape element:sh)
		{
			System.out.println(element);
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		HashSet<Shape>sh=new HashSet<Shape>();
		Shape s1=new Shape("Circle", 100, 30);
		Shape s2=new Shape("Square", 120, 50);
		Shape s3=new Shape("Triangle", 50, 10);
		sh.add(s1);
		sh.add(s2); 
		sh.add(s3);
		List<Shape>list=new ArrayList<>(sh);
		print(list);
		Collections.sort(list);
		System.out.println("-----------------------------------------------");
		System.out.println("               Sorting By Area");
		System.out.println("-----------------------------------------------");
		print(list);
		System.out.println("-----------------------------------------------");
		System.out.println("               Sorting By Name");
		System.out.println("-----------------------------------------------");
		Collections.sort(list,new NameComparator());
		print(list);
		System.out.println("-----------------------------------------------");
		System.out.println("               Sorting By Perimeter");
		System.out.println("-----------------------------------------------");
		Collections.sort(list,new PerimeterComparator());
		print(list);
		System.out.println("-----------------------------------------------");
		System.out.println("               Shuffeled Array");
		System.out.println("-----------------------------------------------");
		Collections.shuffle(list);
		print(list);
	} 

}
