package mum.mpp.lab05.problem03;

public class Triangle implements Shape{

	private final double base;
	private final double height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	
	@Override
	public double area()
	{
		return 0.5*getBase()*getHeight();
	}
	
}
