// Lock will not be effective as two threads are not sharing same object 
import java.util.concurrent.locks.*;
public class Demo2 implements Runnable
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
		Demo2 ob1=new Demo2();
		Demo2 ob2=new Demo2();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
	}
}