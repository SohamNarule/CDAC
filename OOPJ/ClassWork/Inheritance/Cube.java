package practice.Inheritance;

public class Cube extends Volume {
	private float side;
	public void setSide(float side) {
		this.side = side;
	}
	public void calculateVolume()
	{
		this.volume=(float)(Math.pow(side,3));
	}

}
