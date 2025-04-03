public class ClassLock2 implements Runnable
{
	static Class cs;
	 static void disp1()
	 {
		synchronized(cs)
		{
		for(int i=0;i<5;i++)
		{
System.out.println("static "+i);
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException ie)
		{
		}
		}
		}
	}
	public void run()
	{
		disp1();
	}
	public static void main(String args[])throws Exception
	{
		cs=Class.forName("ClassLock2");
		ClassLock2 c=new ClassLock2();
		ClassLock2 c1=new ClassLock2();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}
}