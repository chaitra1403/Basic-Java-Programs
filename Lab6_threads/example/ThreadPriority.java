class ThreadPriority
{
	public static void main(String args[])
	{
		A a =new A();
		B b =new B();
		C c =new C();

		a.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.NORM_PRIORITY);
		c.setPriority(Thread.MIN_PRIORITY);

		b.start();
		a.start();
		c.start();
	}
}
