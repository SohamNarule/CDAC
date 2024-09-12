package sir.Five.Assignment;

public class Assignment_6_5 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,7,8};
		int brr[] = {0,2,3,6,7,9,1,2,4,5,6,8,7,9,2,4};
		int crr[]=new int [arr.length];
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<brr.length;j++)
			{
				if(arr[i]==brr[j])
				{
					crr[i]=brr[j];
				}
			}if(crr[i]!=0)
			{
				System.out.println(crr[i]+" ");
			}
		}
	}
}
