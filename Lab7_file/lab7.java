import java.util.*;
import java.io.*;
import java.io.Console;
class lab7
	{
	public static void main(String args[]) throws Exception
		{
		String s,s1;
		int ch;
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter the file name where you wana perform operation");
		String filename=sc.nextLine();
		File f=new File(filename);
		System.out.println("File created Successfully");
		while(true)
			{
			System.out.println("1.WRITE\n2.APPEND\n3.READ\n4.EXIT\n");
			System.out.print("Enter your choice:");
			ch=sc.nextInt();

			switch(ch)
				{
				case 1:	
                                        FileWriter fw1=new FileWriter(f);
					System.out.println("Enter content into file:");
					sc.nextLine();
					s=sc.nextLine();
					fw1.write(s);
					fw1.close();
					System.out.println(" written successfully");
					break;

				case 2: 
                                        FileWriter fw2=new FileWriter(f,true);
					System.out.println("Enter content to append file:");
					sc.nextLine();
					s1=sc.nextLine();
					fw2.write(s1);
					fw2.close();
					break;

				case 3: 
                                        FileWriter fw3=new FileWriter(f,true);
					BufferedReader br=new BufferedReader(new FileReader(f));
					System.out.println(br.readLine());
					break;

				case 4:System.exit(0);

				default:System.out.println("Wrong choice");

				}
			}
		}
	}

