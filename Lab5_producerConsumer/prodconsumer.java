class pro
	{
	private int num;
	private boolean flag=true;
	public synchronized void put(int i)
			{
			while(flag==false)
				{
				try{
					wait();
       				   }
				catch(InterruptedException ie)
				   {
					System.out.println(ie);
				   }
				}
				num=i;
				flag=false;
				notifyAll();
			}

	public synchronized int get()
			{
			while(flag==true)
			        {
                                try{
                                	wait();
                                   }
                                catch(InterruptedException ie)
                                   {
                               		 ie.printStackTrace();
                                   }
                                }
                                flag=true;
                                return num;
                        }
	}



class producer extends Thread
	{
	pro pg1;
	int num;
	producer(pro pg,int i)
		{
		pg1=pg;
		num=i;
		}

		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				pg1.put(i);
				System.out.println("Produced item -"+i);
				try
				{
					sleep(1000);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		}
	}
class consumer extends Thread
        {
        pro pg1;
        int num;
        consumer(pro pg)
                {
                pg1=pg;
                }

                public void run()
                {
                        for(int i=1;i<=10;i++)
                        {
                                num=pg1.get();
                                System.out.println("consumed item-"+num);
                           	System.out.println();
			     try
                                {
                                        sleep(1000);
                                }
                                catch(InterruptedException ie)
                                {
                                        ie.printStackTrace();
                                }
                        }
                }
        }

public class prodconsumer
	{
	public static void main(String args[])
		{
		pro pg=new pro();
		new producer(pg,5).start();
		new consumer(pg).start();
		}
	}

