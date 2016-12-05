package mum.mpp.lab05.problem03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapes = new ArrayList<Shape>();
		Shape s1 = new Rectangle(2, 3);
		Shape s2 = new Triangle(3, 5);
		Shape s3 = new Circle(3);
		
		shapes.add(s1);
		shapes.add(s2);
		shapes.add(s3);
	
		System.out.println("Sum of Areas : " + shapes.stream().mapToDouble(s -> s.area()).reduce(0, Double::sum));
	}

}
