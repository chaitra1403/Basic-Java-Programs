import java.util.*;

//single inheritance
class Sparent
{
	public void sum()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,sum=0;
		System.out.println("Enter two numbers to find the sum");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("sum = "+sum);
	}
}
class Sinherit extends Sparent
{
	public void sub()
	{
		Scanner sc=new Scanner(System.in);
		int c,d,sub=0;
		System.out.println("Enter two numbers to find the sub");
		c=sc.nextInt();
		d=sc.nextInt();
		sub=c-d;
		System.out.println("sub = "+sub);
		System.out.println("****************************************************************");

	}
}
//multilevel
class Mparent
{
	public void mul()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,mul=1;
		System.out.println("Enter two numbers to find the product");
		a=sc.nextInt();
		b=sc.nextInt();
		mul=a*b;
		System.out.println("mul = "+mul);
	}
}
class Mchild extends Mparent
{
	public void div()
	{
		Scanner sc=new Scanner(System.in);

		int c,d,div=1;
		System.out.println("Enter two numbers");
		c=sc.nextInt();
		d=sc.nextInt();
		div=c/d;
		System.out.println("div = "+div);
	}
}
class Minherit extends Mchild
{
	public void sqr()
	{
		Scanner sc=new Scanner(System.in);

		int e;
		System.out.println("Enter a number to find square");
		e=sc.nextInt();
		System.out.println(e*e);
		System.out.println("****************************************************************");

	}
}
//Hierarchical Inheritance
class Hparent
{
	public void dis()
	{
		System.out.print("this is chaitra\t");
	}
}
class Hchild1 extends Hparent
{
	public void show()
	{
		System.out.println("i am from Tumkur");
	}
}
class Hchild2 extends Hparent
{
	public void show1()
	{
		System.out.println("i am from RVCE");
	}
}




class Labtwo
{
	public static void main(String args[])
	{
		while(true)
		{
			int ch,x;
			System.out.println("****************************************************************");
			System.out.println("\t\tINHERITANCE");
			System.out.println("1.Single Inheritance\n2.multi level inheritance\n3.Hierarchical Inheritance\n4.exit");
			System.out.println("****************************************************************");
			System.out.println("Enter your choice:\t");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("\n\t\tSINGLE INHERITANCE");
					Sinherit obj1=new Sinherit();
					obj1.sum();
					obj1.sub();
					break;

				case 2:
					System.out.println("\n\t\tMulti level inheritance ");
					Minherit obj2=new Minherit();
					obj2.mul();
					obj2.div();
					obj2.sqr();
					break;
				case 3:System.out.println("\n\t\tHierarchical Inheritance");
					Hchild1 obj3=new Hchild1();
					obj3.dis();
					obj3.show();
					Hchild2 obj4=new Hchild2();
					obj4.dis();
					obj4.show1();
					break;
				case 4:
					System.out.println("************************THANKYOU********************************");
					System.exit(0);
				default:System.out.println("Please enter valid choice");
			}
		}
	}
}
