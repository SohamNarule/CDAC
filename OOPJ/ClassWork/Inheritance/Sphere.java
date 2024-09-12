package practice.Inheritance;

public class Sphere extends Volume{

	private float radius;
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateVolume()
	{
		this.volume=(float)((4/3)*Math.PI*Math.pow(radius, 3));
	}
}