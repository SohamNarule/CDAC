//Linked List Insertion Operation (In between)
import java.util.Scanner;
public class Linked_list_3
{
	static Node head;
	static class Node {
		Node next;
		int data;
		public Node (int value)
		{
			data=value;
			next=null;
		}
	
	public static void insertStart(int value)
	{
		Node n= new Node (value);
		n.next=head;
		head=n;
	}
	public static void display()
	{
		Node n=head;
			while(n!=null)
			{
				System.out.println(n.data);
				n=n.next;
			}
	}
	public static void insertInto(Node priv_node,int value)
	{
		Node n= new Node(value);
		n.next=priv_node.next;
		priv_node.next=n;
	}
	}
	public static void main (String args[])
	{
		Linked_list_3 l=new Linked_list_3();
		l.head=new Node(10);
		Node two =new Node(30);
		Node three=new Node(50);
		l.head.next=two;
		two.next=three;	
		Node.display();
		//System.out.println("------------------------------");
		//Node.insertStart(00);
		//Node.display();
		System.out.println("------------------------------");
		Node.insertInto(head,20);
		Node.display();
		System.out.println("------------------------------");
		Node.insertInto(two,40);
		Node.display();
	}	
}