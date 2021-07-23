public class priority
	{
	public static void prioritytest()
		{
		Thread t1=new Thread(new MyThread(),"Thread-1");
		Thread t2=new Thread(new MyThread(),"Thread-2");
		Thread t3=new Thread(new MyThread(),"Thread-3");
		Thread t4=new Thread(new MyThread(),"Thread-4");
		Thread t5=new Thread(new MyThread(),"Thread-5");

		t1.setPriority(8);
		t1.setPriority(6);
		t1.setPriority(4);
		t1.setPriority(2);
		t1.setPriority(1);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		}

		public static void main(String args[])
			{
			prioritytest();
			}
	}

