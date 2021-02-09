package oopsAssignment;

import oopsAssignment.Shapes.Polygon;

public class Square implements Polygon 
{
	float side;
	float area;
	float perimeter;
	@Override
	public void Area()
	{
		area=side*side;
		System.out.println("Area of Square is "+area);
		
	}

	@Override
	public void Perimeter() 
	{
		perimeter=4*side;
		System.out.println("Perimeter "+perimeter);
	}
}
