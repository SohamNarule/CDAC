package sir.nine.Assignment;
import java.util.Scanner;
public class AsAssignment_6_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int ch=5,x,y;
		System.out.println("Enter the no of row");
		int r=sc.nextInt();
		System.out.println("Enter the no of Columns");
		int c=sc.nextInt();
		int arr[][]=new int [r][c];
		System.out.println("Welcome To FlyEmirits!!");
		for(int i=1;i<=r;i++){
			for(int j=1;j<=c;j++){
				System.out.print("[ ]");
			}System.out.println();
		}do {
		System.out.println("Enter Row And Column to book Seat");
		x=sc.nextInt();
		y=sc.nextInt();			
		for(int i=1;i<=r;i++){
			for(int j=1;j<=c;j++){
				if(i==x&&j==y)
				{System.out.print("[O]");
				}else
				System.out.print("[ ]");}
			System.out.println("");
		}
		System.out.println("Your Seat is Booked!!");
		System.out.println("[O]: Occupied");		
		System.out.println("Do you want to Slected Seat?\n1.Yes\n2.NO");
		ch=sc.nextInt();
		} while (ch!=2);
		System.out.println("Do you want to Cancel Slected Seat?\n1.Yes\n2.NO");
		int w=sc.nextInt();
		if(w==1) {
			for(int i=1;i<=r;i++)
			{for(int j=1;j<=c;j++)
				{if(i==x&&j==y)
					{System.out.print("[ ]");
					}else
					System.out.print("[ ]");}
				System.out.println();
			}
		}else
		{
			System.out.println("Current Seat Status:");
			for(int i=1;i<=r;i++)
			{
				for(int j=1;j<=c;j++)
				{
					if(i==x&&j==y)
					{
						System.out.print("[O]");
					}else
					System.out.print("[ ]");
				}
				System.out.println("");}}}}
