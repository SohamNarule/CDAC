// to get class name of created instance 

package Basic_Syntax;

import java.util.Scanner;
import java.lang.Object;
class Test
{
	
}

public class Level_1 {

	public static void main(String[] args) {
		String str = new String();
		System.out.println(str.getClass());

		Integer i =new Integer(10);
		System.out.println(i.getClass());
		
		Float f=2.2f;
		System.out.println(f.getClass());
		
		Object obj = new Object();
		System.out.println(obj.getClass());
		
		Boolean b=true;
		System.out.println(b.getClass());
		
		Test t=new Test();
		System.out.println(t.getClass());
		
 // To get class name from user 
		try {
			System.out.println("Enter The Ligal Class name : ");
			Scanner sc=new Scanner (System.in);
		
//			Class<?> c =Class.forName(sc.nextLine());
			System.out.println(Class.forName(sc.nextLine()).getSimpleName());
			System.out.println(Class.forName(sc.nextLine()).getSuperclass());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
