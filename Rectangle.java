package oopsAssignment;

import oopsAssignment.Shapes.Polygon;

public class Rectangle implements Polygon
{
	float  length;
	float breadth;
	float area;
	float perimeter;
	@Override
	public void Area()
	{
		area=length*breadth;
		System.out.println("Area of rectangle "+area);
		
	}
	@Override
	public void Perimeter() 
	{
		perimeter=2*(length+breadth);
		System.out.println("Perimeter is "+perimeter);	
	}

}
