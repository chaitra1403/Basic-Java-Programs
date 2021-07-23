import java.util.Scanner;

class MyException extends Exception
{
	private float ex;
	int count=0;
	MyException(float a)
	{
		ex = a;
	}
	public String toString()
	{
		if((ex<0) || (ex>10))
			return "invalid CGPA";
 		else
			return "CGPA doesnt match our requirement ";
	}
}
class AgeException extends Exception
{
	private float ex;
	int count=0;
	AgeException(int b)
	{
		ex=b;
	}
	public String toString()
	{
		if((ex<=0)||(ex>100))
			return "Enter the valid age";
		else
			return "you age doesnt match our requirement";
	}
}



class Cgpa
{
	static void CGPA(float a) throws MyException
  	{
    		if(a>5 && a<=10)
    		{
      			System.out.println("you CGPA matches our requirement");
    		}
		else
    		{
      			throw new MyException(a);
    		}
	}
	static void check(int a) throws AgeException
	{
		if(a>20 && a<30)
		{
			System.out.println("your age matches our requirement");
		}
		else
		{
			throw new AgeException(a);
		}
	}
	public static void main(String[] args)
  	{
		Scanner sc=new Scanner(System.in);
		System.out.println("to check eligibility for applying internship");
		try
		{
    			try
    			{
				System.out.println("Enter the CGPA");
				float points=sc.nextFloat();
      				CGPA(points);
    			}
    			catch(MyException me)
    			{
      				System.out.println(me);
    			}


			try
			{
				System.out.println("Enter your age");
				int age=sc.nextInt();
				check(age);
			}
			catch(AgeException ae)
			{
				System.out.println(ae);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
