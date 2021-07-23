public class MyThread implements Runnable
	{
	private int counter=0;

	public void increment()
		{
		counter++;
		}
		@Override
		public synchronized void run()
			{
			while(counter<2)
				{
				System.out.format("%s,Counter at %d\n",Thread.currentThread().getName(),counter);
				increment();
				}
			}
	}

