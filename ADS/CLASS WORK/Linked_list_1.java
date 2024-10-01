import java.util.Scanner;
public  class Linked_list_1
{
	static Node head;
static class Node
{
	Node next;
	int data;
	public Node(int d)
	{
		this.data=d;
		next=null;
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
}
	public static void main(String args[])
	{
		Linked_list_1 l1=new Linked_list_1();
		l1.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		l1.head.next=second;
		second.next=third;
		Node.display();
	}

}