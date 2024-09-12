package sir.Six.Asiignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			if(m<=n+1) {
				arr[i]=m;
			}
			else
			{
				System.out.println("Please enter a number between 1 and "+n);
				i--;
			}
		}
		Arrays.sort(arr);
		for(int i=1; i<=n; i++){
            int flag = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
            	System.out.println(i+" :is missing number");
            	System.out.println("From Below Array");
            	
            	for ( i=0;i<arr.length;i++) {
                System.out.print(arr[i]);
            	}
            	}
        }
		sc.close();
	}
}


