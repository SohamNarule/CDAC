// All Methods And With Sorting - Shuffling Methods
//Comments Must read 
package ArrayList;
import java.util.ArrayList;
public class Built_In {
static void Display(ArrayList L)
{
	if(L==null)
		{
		   return;
		}
	 for(Object element:L)
	 {
		 System.out.print(element+", ");
	 }
	 System.out.println();
}
public static void main(String[] args) {
ArrayList<String> strlist1=new ArrayList<>();
ArrayList<String> strlist2=new ArrayList<>();
System.out.println("-----------------------------------------------");
System.out.println("Adding the String elements into the array List");
System.out.println("-----------------------------------------------");
strlist1.add("Soham");
strlist1.add("Dipesh");
strlist1.add("India");
strlist1.add("Dhoni");
strlist1.add("Virat");
strlist1.add("Bharat");

strlist2.add("Ashwin");
strlist2.add("Dhoni");
strlist2.add("Siraj");
strlist2.add("jadeja");
strlist2.add("Virat");
strlist2.add("Sachin");
System.out.println("-----------------------------------------------");
System.out.println("          Printing the Elements of list        ");
System.out.println("-----------------------------------------------");
Display(strlist1);
Display(strlist2);
System.out.println("-----------------------------------------------");
System.out.println("      Adding one list into another List        ");
System.out.println("-----------------------------------------------");
//strlist1.addAll(strlist2); 
Display(strlist1); // Now Array list becomes merge array or mixed Array 
Display(strlist2);
System.out.println("-----------------------------------------------");
System.out.println("          Getting Common from Both             ");
System.out.println("-----------------------------------------------");
strlist1.retainAll(strlist2);
Display(strlist1);
Display(strlist2);
System.out.println("-----------------------------------------------");
System.out.println("        Remove Perticular          ");
System.out.println("-----------------------------------------------");
strlist1.remove("Bharat");
Display(strlist1);
Display(strlist2);
System.out.println("-----------------------------------------------");
System.out.println("    Check perticular String Contains or not    ");
System.out.println("-----------------------------------------------");
boolean B1 =strlist1.contains("Dhoni");
boolean B2 =strlist1.contains("Rohit");
System.out.println(B1);
System.out.println(B2);
System.out.println("-----------------------------------------------");
System.out.println("Check wether the the whole array contains or not ");
System.out.println("-----------------------------------------------");
ArrayList<String> strlist3=new ArrayList<>();
strlist3.add("Soham");
strlist3.add("Dipesh");
boolean B3 =strlist1.containsAll(strlist2);//it will return False coz strlist1 can not  contain all elements from strlist2
boolean B4 =strlist1.containsAll(strlist3);//it will return True coz strlist1 contain all elements from strlist3
System.out.println("For old 2nd Array: "+B3);
System.out.println("For new String Array: "+B4);


}

}
