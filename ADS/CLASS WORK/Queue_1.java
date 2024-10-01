//Simple Queue
import java.util.Scanner;
class Queue
{
	int front =-1;
	int rare=-1;
	int arr[]=new int[10];
	public void enQueue(int value)
	{
	if (rare==9)
	{
		System.out.println("End of queue");
	}else
	if(front==-1&&rare==-1)
	{
		front=0;
		rare=0;
		arr[rare]=value;
	}else 
	{
		rare=rare+1;
		arr[rare]=value;
	}
	}
	public void deQueue()
	{
		if(rare==-1)
		{
			System.out.println("Queue is Empty");
		}else 
		{
			front=front+1;
		}
	}
	public void display()
	{
		for (int i=rare;i>=front;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class Queue_1

{
	public static void main(String args[])
	{
		Queue Q=new Queue();
		Q.enQueue(10);
		Q.enQueue(20);
		Q.enQueue(30);
		Q.display();
		System.out.println("-------------");
		Q.deQueue();
		Q.display();
	}
}
		