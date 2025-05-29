// combination of Thread pool and Explicit locking
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
public class Demo1_a implements Runnable
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
		ExecutorService exec=Executors.newFixedThreadPool(2);
		exec.execute(ob);
		exec.execute(ob);
		exec.shutdown();
	}
}