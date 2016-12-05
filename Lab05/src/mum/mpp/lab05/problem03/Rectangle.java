package mum.mpp.lab05.problem03;

public class Rectangle implements Shape {

	private final double width;
	private final double height;
	public Rectangle(double width, double lenght) {
		this.width = width;
		this.height = lenght;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	@Override
	public double area()
	{
		return getWidth() * getHeight();
	}
	
}
