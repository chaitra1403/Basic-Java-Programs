import java.io.*;
import java.util.*;
interface Employee
{
	 public void emp();
}
interface Calculate
{
	public void cal();
}
class Salary implements Employee,Calculate
{
	Scanner sc=new Scanner(System.in);
	int age;
	double basic,hra=0.05,da=0.09,tax=0.1,gross,net;
	String empname,empid;
	public void emp()
	{
		System.out.println("enter emp id");
		empid=sc.next();
		System.out.println("enter the name of Employee");
		empname=sc.next();
		System.out.println("enter age of employee");
		age=sc.nextInt();
		System.out.println("enter basic pay of employee");
		basic=sc.nextDouble();
	}
	public void cal()
	{

		gross=basic*hra*da;
		tax=(basic*tax)-basic;
		net=gross-tax;
	}
	public void disp()
	{
		System.out.println("******************************************************************************");
		System.out.println("\tEMPLOYEE DETAILS");
		System.out.println("\n\tempid\t=\t"+empid+"\n\tNAME\t=\t" +empname+"\n\tage\t=\t"+age+"\n\tbasic\t=\t"+basic);
		System.out.println("______________________________________________________________________________");
		System.out.println("\tTOTAL SALARY = "+net);
		System.out.println("******************************************************************************");

	}
}
class inter
{
	public static void main(String args[])
	{
		Salary a1=new Salary();
		a1.emp();
		a1.cal();
		a1.disp();
	}
}

