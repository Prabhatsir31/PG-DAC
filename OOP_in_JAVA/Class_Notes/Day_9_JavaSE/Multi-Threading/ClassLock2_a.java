public class ClassLock2_a implements Runnable
{
	 static void disp1()
	 {
		synchronized(ClassLock2_a.class)
		{
		for(int i=0;i<5;i++)
		{
			System.out.println("static "+i);
		}
		}
	}
	public void run()
	{
		disp1();
	}
	public static void main(String args[])
	{
		ClassLock2_a c=new ClassLock2_a();
		ClassLock2_a c1=new ClassLock2_a();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}
}