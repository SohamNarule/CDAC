package sir.two.Assignment;

public class Assignment_6_2 {

	public static int accept_record(int j)
	{			 
		return print_record(j);
	}
	public static int print_record(int j)
	{
		System.out.println(j);
		return 0; 
		
	}
	public static void main(String[] args) {
		
		int arr[]=new int[5];

		for(int i=0;i<arr.length;i++) 
		{
			Assignment_6_2.accept_record(Integer.parseInt(args[i]));
		}
	}

}
