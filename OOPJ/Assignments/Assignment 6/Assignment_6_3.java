package sir.two.Assignment;

public class Assignment_6_3 {

	public static void main(String[] args) {
		int arr[]= {1,5,6,0,2,3,9};
		int max=0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number From Array:   "+max);
		int min=arr[1];
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Number From Array:   "+min);
	}

}
