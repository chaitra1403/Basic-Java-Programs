import Geometry.Area;
import java.util.*;
class Labthree
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("**********************************************************************");
			Area g1=new Area();
			System.out.println("1)area of circle\n2)area of triangle");
			System.out.println("3)area of rectangle\n4)area of square\n5)area of rhombus\n6)exit");
			System.out.println("**********************************************************************");

			System.out.println("enter your choice please:");
			int ch=sc.nextInt();

			switch(ch)
			{
				case 1:	double r1,a1;
					System.out.print("enter the radius: "); 
					r1=sc.nextDouble();
					a1=g1.circle(r1);
					System.out.println("the area of circle is: "+a1);
					break;
				case 2:	int a2,b,h;
					System.out.print("enter the base for triangle:\t");
					b=sc.nextInt();
					System.out.print("enter the height for triangle:\t");
					h=sc.nextInt();
					a2=g1.triangle(b,h);
					System.out.println("the area of triangle is: "+a2);
					break;
				case 3:
					System.out.print("enter the length and breadth for rectangle: ");
					int length=sc.nextInt();
					int breadth=sc.nextInt();
					int area3=g1.rectangle(length,breadth);
					System.out.println("the area of rectangle: "+area3);
					break;
				case 4:
					System.out.print("enter the side for square: ");
					int side=sc.nextInt();
					int area4=g1.square(side);
					System.out.println("the area of square: "+area4);
					break;
				case 5:	double d1,d2,area5;
					System.out.print("enter the first diagnol for rhombus: ");
					d1=sc.nextDouble();
					System.out.print("enter the second diagonal: ");
					d2=sc.nextDouble();
					area5=g1.rhombus(d1,d2);
					System.out.println("the area of rhombus: "+area5);
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("wrong use input");
			}
		System.out.println("Do u wana continue?(0/1)");
		int x=sc.nextInt();
		if(x==1)
			continue;
		else
			System.exit(0);
		}
	}
}
