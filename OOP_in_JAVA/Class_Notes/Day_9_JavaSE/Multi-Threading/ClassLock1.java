public class ClassLock1 implements Runnable
{
	synchronized static void disp1()
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
	public void run()
	{
		disp1();
	}
	public static void main(String args[])
	{
		ClassLock1 c=new ClassLock1();
		ClassLock1 c1=new ClassLock1();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}
}