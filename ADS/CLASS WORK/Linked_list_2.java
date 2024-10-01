//Innsert Operations In Linked List (Insert At Start) 
import java.util.Scanner;
class Linked_list_2 
{
static Node head;

static class Node 
{
	int data;
	Node next;
	public Node()
	{
		
	}
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+"--->");
			n=n.next;
		}
	}
	public void insert(int v)
	{
		Node n=new Node(v);
		n.next=head;
		head=n;
	}
}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Linked_list_2 l=new Linked_list_2();
		Node N= new Node();
		l.head=new Node(10);
		Node n2= new Node (20);
		Node n3= new Node (30);
		l.head.next=n2;
		n2.next=n3;
		N.insert(00);
		N.display();
		
	}
}