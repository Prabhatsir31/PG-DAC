import java.util.concurrent.locks.*;
public class Demo1 implements Runnable
{
	ReentrantLock mylock=new ReentrantLock();
	public void run()
	{
		mylock.lock();
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		mylock.unlock();
	}
	public static void main(String args[])
	{
		Demo1 ob=new Demo1();
		Thread t1=new Thread(ob,"first");
		Thread t2=new Thread(ob,"second");
		t1.start();
		t2.start();
	}
}