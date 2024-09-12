package sir.Four.Assignment;

public class Assignment_6_4 {

	public static void main(String[] args) {
		int i;
		int arr[]= {1,2,5,4,4,3,1,1,};
		{
		for(i=0;i<arr.length;i++)
		{if (arr[i]!=0);
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
			if(arr[i]!=0) {
			System.out.println(arr[i]+"");
			}
		}
		}

	}

}
