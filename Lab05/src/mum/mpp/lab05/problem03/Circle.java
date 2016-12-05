package mum.mpp.lab05.problem03;

public class Circle implements Shape{

	private final double radius;

	public Circle(double radius) {
			this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	@Override
	public double area()
	{
		return Math.PI * getRadius();
	}
}
