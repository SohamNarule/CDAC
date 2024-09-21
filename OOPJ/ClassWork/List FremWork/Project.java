package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class Utility
{
	Scanner sc=new Scanner (System.in);
	Project P =new Project();
	public int setListSize()
	{
		System.out.print("Enter the Size you want to store in list : ");
		int size=sc.nextInt();
		return size;
	}
	public void AcceptList(int size, ArrayList<String> Food) {
		
		System.out.println("Enter The Food Items");
		for (int i=0;i<size;i++)
		{
			Food.add(sc.nextLine());
		}
		
	}
	public void PrintList(ArrayList<String> Food)
	{
		Iterator<String> it = Food.iterator();
		System.out.println("Items Present In List:  ");
			while(it.hasNext())
			{
				System.out.println(it.next());
		    }		
	}
	
	public void removeItem(int s,ArrayList Food)
	{
		Food.remove(s);
	}
	public void Updatelist(ArrayList Food)
	{
		System.out.println("1.Add item\n2.Remove Item");
		int ch=sc.nextInt();
			if (ch==1)
			{
				System.out.println("Number Of items Do you want to Add:");
				int no=sc.nextInt();
				AcceptList(no,Food);
			}
			if (ch==2)
			{
				PrintList(Food);
				System.out.println("Enter The index of Item:");
				int item=sc.nextInt();
			    removeItem(item, Food);
			}	
	}
	
}
public class Project {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		Utility U =new Utility();
		int size=U.setListSize();
		ArrayList<String> Food =new ArrayList<String>(size);
		U.AcceptList(size,Food);
		U.PrintList(Food);
		System.out.println("Do You Want To update the list ?\n1.Yes\n2.No ");
		if (sc.nextInt()==1)
		{
			U.Updatelist(Food);
		}
		U.PrintList(Food);
	}

}
