package Map;

import java.util.*;
public class Built_in {
	public static void display(Collection<?> c)
	{
		for(Object obj:c)
		{
			System.out.println(obj);
		}
	}
	public static void display2(Map<Integer,String> B)
	{
		
		for(Map.Entry<Integer, String> entry:B.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		HashMap<Integer,String> hm =new HashMap<>();
		//Storing values in Hash map Which are key and its value 
		hm.put(1, "Spiderman");
		hm.put(2, "HalkEye");
		hm.put(3, "Dr.Strenge");
		hm.put(4, "Hela");
		hm.put(5, "IronMan");
		
		//Printing data
		System.out.println(hm);
		
		//Retrieving data 
		System.out.println(hm.get(5));
		
		// printing in formate 
		//As we know HashMap does not contain iterable Sonned to Convert it into Hash Set
		
		
		
		//Printing Only key 
		Set<Integer> keyset=hm.keySet();
		display(keyset);
		
		//Printing only values 
		Collection<String> strset=hm.values();
		display(strset);
		
		//replace the values by using again put method
		hm.put(4, "Black Panther");
		display2(hm);
		
		
		Set<Map.Entry<Integer,String>>sm=hm.entrySet();
		display(sm);
	}

}
