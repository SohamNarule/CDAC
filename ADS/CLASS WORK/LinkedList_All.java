//Linked List [count, reverse, Middel ]
import java.util.Scanner;
class LinkedList_All{
	

 Node head;
static class Node{
		Node next;
		int data;
		public Node(int value)
		{
			data=value;
			next=null;
		}
}
	public void insertstart(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
		}else
		{
			new_node.next=head;
			head=new_node;
		}
	}
	public void insertmid(int key,int value)
	{
		Node mid_node=new Node(value); 
		Node A=head;
		while(A.data!=key)
		{
			A=A.next;
		}
		mid_node.next=A.next;
		A.next=mid_node; 		
		
	}
	public void insertlast(int value)
	{
		Node end_node=new Node(value); 
		Node B=head;
		if(B==null)
		{
			B=end_node;
		}
		while(B.next!=null)
		{
			B=B.next;
		}
		B.next=end_node;
		
	}
	public void remove(int key)
	{
		Node C=head;
		Node D=null;
		if(C!=null&&key==head.data)
		{
			head=head.next;
		}else{
		while(C!=null &&key!=C.data)
		{
			D=C;
			C=C.next;
		}
		D.next=C.next;
		}
	}
	public void reverse()
	{
		Node X=null,Y=null;
		Node current=head;
		while(current!=null)
		{
			Y=current.next;
			current.next=X;
			X=current;
			current=Y;
		}
		head=X;
		
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
		}
	
	public static void main (String args[])
	{
		LinkedList_All ll=new LinkedList_All();	
		Scanner sc=new Scanner(System.in);	
		System.out.println("Welcome To Linked List !!!!");
		do{
		System.out.println("Which Operation Do you want to perform\n1.insertion\n2.Deletion\n3.Reverse");
		switch(sc.nextInt())
		{
			case 1:
			{
					System.out.println("Which Insersion\n1.At start\n2.At Mid\n3.End");
					switch(sc.nextInt())
					{
						case 1:
						{
							System.out.println("How many values do you want to store ");
							int n=sc.nextInt();
							for(int i=0;i<n;i++)
							{
							System.out.println("Enter the value to add");
							ll.insertstart(sc.nextInt());
							}
							System.out.println("Your list:-");ll.display();
						}
						break;
						case 2:
						{
							System.out.println("How many values do you want to store ");
							int n=sc.nextInt();
							for(int i=0;i<n;i++)
							{
							System.out.println("Enter the value after which you add your value and then add value to be add ");
							ll.insertmid(sc.nextInt(),sc.nextInt());
							}
							System.out.println("Your list:-");ll.display();
						}break;
						case 3:
						{
							System.out.println("How many values do you want to store at end of list ");
							int n=sc.nextInt();
							for(int i=0;i<n;i++)
							{
							System.out.println("Enter the value to add");
							ll.insertlast(sc.nextInt());
							}
							System.out.println("Your list:-");
							ll.display();
						}break;
					}
			}break;
			case 2:
			{
				System.out.println("How many values do you want to Delete ");
							int n=sc.nextInt();
							for(int i=0;i<n;i++)
							{
							System.out.println("Enter the value to delete");
							ll.remove(sc.nextInt());
							}
							System.out.println("Your list:-");
							ll.display();
			}break;
			case 3:
			{
				ll.reverse();
				System.out.println("Your list:-");ll.display();
			}break;
		}
		System.out.println("Do you want to perform again \n1.Yes\n2.No");
		}
		while(sc.nextInt()==1);
		
		
	}
		
}

		
	