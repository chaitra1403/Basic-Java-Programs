import java.lang.Thread;
import java.lang.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("\tFrom Thread A:i=" + i);
		}
		System.out.println("Exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println("\tFrom Thread B:j=" + j);
		}
		System.out.println("Exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=10;k++)
		{
			System.out.println("\tFrom Thread C:k=" + k);
		}
		System.out.println("Exit from C");
	}
}
