class demoover
	{
	int a;
	float b;
	String s;

	public demoover()
		{
		System.out.println("***********************************");
		System.out.println("Default constructor is called");
		a=5;
		}

	public demoover(int d)
		{
		System.out.println("One parameter constructor is called");
		a=d;
		}

	public demoover(int d,float g)
		{
		System.out.println("Two parameter constructor is called");
		a=d;
		b=g;
		}

	public void add()
		{
		System.out.println("Result is="+(a+a));
		}

	public void add(int a)
		{
		System.out.println("Result is="+(a+a));
		}

	public void add(int a,float f)
		{
		System.out.println("Result is="+(a+f));
		}

	public void add(int a,String s)
		{
		System.out.println("Result is="+(a+s));
		System.out.println("***********************************");
		}
	}

public class lab1
	{
		public static void main(String args[])
			{
			demoover obj=new demoover();
			System.out.println("Default value is set to="+(obj.a));

			demoover obj1=new demoover(10);
			System.out.println("Passed single parameter value is="+(obj1.a));

			demoover obj2=new demoover(20,3.5f);
			System.out.println("Passed two parameter values are="+(obj2.a+","+obj2.b));

			System.out.println("Demonstrating method overloading concept");
			System.out.println("Method with no argument passed");
			obj.add();
			System.out.println("Method with single parameter passed");
			obj.add(10);
			System.out.println("Method with two parameter passed");
			obj.add(20,3.5f);
			System.out.println("Method with integer and string  as parameter");
			obj.add(1000,"RVCE");
			}
	}

