package practice.Inheritance;

public class Cylinder extends Volume {
	private float radius;
	private float hight;
	public Cylinder() {
		
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void setHight(float hight)
	{
		this.hight = hight;
	}
	public void calculateVolume()
	{
		this.volume=(float)(Math.PI*(Math.pow(radius, 2)*hight));
	}

}
