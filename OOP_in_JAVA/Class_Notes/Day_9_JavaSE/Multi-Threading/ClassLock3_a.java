public class ClassLock3_a implements Runnable
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
			cs.wait(100);
		}
		catch(InterruptedException ie)
		{
		}
	}
System.out.println("static "+i);
		//cs.notifyAll();  // not required
		}
		}
	}
	
	public void run()
	{
		disp1();
	}
	public static void main(String args[])throws Exception
	{
		cs=Class.forName("ClassLock3_a");
		ClassLock3_a c=new ClassLock3_a();
		ClassLock3_a c1=new ClassLock3_a();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}
}