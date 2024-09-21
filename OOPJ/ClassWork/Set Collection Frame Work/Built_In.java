package HashSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Built_In {

	public static void main(String[] args) {
		HashSet<String> SetStr=new HashSet<>();
		ArrayList<String> StrList =new ArrayList<>();
		
		
		//1.Adding the String values in Set
		SetStr.add("Spiderman");
		SetStr.add("Hulk");
		SetStr.add("Ironman");
		SetStr.add("Thor");
		SetStr.add("Loki");
		System.out.println(SetStr);
		
		//1. Adding the values in Array 
		StrList.add("Captain America");
		StrList.add("Vision");
		StrList.add("Thor");
		StrList.add("Loki");
		
		//2.Removing the values 
		SetStr.remove("Hulk");
		System.out.println(SetStr);
		
		//3.Using Iterator
		Iterator<String> it =SetStr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//4.Cheaking empty or not 
		boolean b=SetStr.isEmpty();
		System.out.println(b);
		
		//5.Removing the all String members from HashSet 
//		SetStr.clear();
//		SetStr.removeAll(SetStr);
		System.out.println(SetStr);
		
		//6.Getting Size of an Set 
		System.out.println(SetStr.size());
		
		//7.Clone (Shallow Copy)
		SetStr.clone();
		
	
		//8.Contains
		boolean b1=SetStr.contains("Thor");
		System.out.println(b1);
		
		//9.Retain 
		SetStr.retainAll(StrList);
		System.out.println(SetStr);
		
		
	}

}
