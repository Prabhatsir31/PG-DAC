/*in case of ReentrantLock when exception is raised , lock is not released.
hence it is very imp to unlock inside finally block */

import java.util.concurrent.locks.*;
public class Demo2 implements Runnable
{
	ReentrantLock mylock=new ReentrantLock();
	public void run()
	{
		try
		{
		mylock.lock();
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);

						if(i==2 && Thread.currentThread().getName().equalsIgnoreCase("first"))
		{
			throw new RuntimeException();
		}
		}
		}
		finally
		{
			mylock.unlock();
		}
	}
	
	public static void main(String args[])
	{
		Demo2 ob=new Demo2();
		Thread t1=new Thread(ob,"first");
		Thread t2=new Thread(ob,"second");
		t1.start();
		t2.start();
	}
}