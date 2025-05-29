import java.util.concurrent.locks.*;
import java.util.concurrent.*;
public class TryLockDemo2 implements Runnable
{
	ReentrantLock mylock=new ReentrantLock();
	public void run()
	{
		while(true)
		{
		try
		{
		if(mylock.tryLock(2,TimeUnit.MILLISECONDS))
		{
		for(int i=0;i<18;i++)
		{	
			System.out.println("Hello"+i+"\t"+Thread.currentThread().getName());
			
		}
		mylock.unlock();
		break;
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" doing something else");
		}
		}
		catch(InterruptedException ie)
		{
			System.out.println("in catch\t"+ie);
		}
		}
		
	}
	public static void main(String args[])
	{
		TryLockDemo2 ob=new TryLockDemo2();
		Thread t1=new Thread(ob,"first");
		Thread t2=new Thread(ob,"second");
		t1.start();
		t2.start();
	}
}