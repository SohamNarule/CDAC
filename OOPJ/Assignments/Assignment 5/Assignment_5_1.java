//1.	Design and implement a class named InstanceCounter to track and count the number of instances created from this class.
package Assignment.one.java;
class InstanceCounter
{
	private static int counter;
	
	public InstanceCounter()
	{
		this.counter++;
		this.setCounter(counter);
	    System.out.println("Instance No: "+this.getCounter());	
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
public class Assignment_5_1 {

	public static void main(String[] args) {
		InstanceCounter IC0 =new InstanceCounter();
		InstanceCounter IC1 =new InstanceCounter();
		InstanceCounter IC2 =new InstanceCounter();
		InstanceCounter IC3 =new InstanceCounter();
		
	}

}
