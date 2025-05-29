public class ClassLock3 implements Runnable
{
	static Class cs;
	 static void disp1()
	 {
		synchronized(cs)
		{
		for(int i=0;i<5;i++)
		{
if(i==3)
	{
		try
		{
			cs.wait();
		}
		catch(InterruptedException ie)
		{
		}
	}
System.out.println("static "+i);
		cs.notifyAll();
		}
		}
	}
	
	public void run()
	{
		disp1();
	}
	public static void main(String args[])throws Exception
	{
		cs=Class.forName("ClassLock3");
		ClassLock3 c=new ClassLock3();
		ClassLock3 c1=new ClassLock3();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}
}