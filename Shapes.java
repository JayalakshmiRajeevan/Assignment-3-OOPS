package oopsAssignment;

public class Shapes 
{
	interface Polygon
	{
		void Area();
		void Perimeter();
	}
	public static void main(String[] args)
	{
		Square s=new Square();
		Rectangle r=new Rectangle();
		s.side=4;
		r.length=3;
		r.breadth=5;
		s.Area();
		s.Perimeter();
		r.Area();
		r.Perimeter();
	}
}
