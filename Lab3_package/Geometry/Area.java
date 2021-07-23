package Geometry;
public class Area
{
	public double circle(double r)
	{
		double x=3.14*r*r;
		return x;
	}
	public int square(int side)
	{
		int x=side*side;
		return x;
	}
	public int triangle(int base,int height)
	{
		int x=(base*height)/2;
		return x;
	}
	public int rectangle(int length,int breadth)
	{
		int x=length*breadth;
		return x;
	}
	public double rhombus(double a,double b)
	{
		double x=(a*b)/2;
		return x;
	}
}


