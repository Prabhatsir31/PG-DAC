import java.util.concurrent.locks.*;
public class TryLockDemo1 implements Runnable
{
	ReentrantLock mylock=new ReentrantLock();
	public void run()
	{
		while(true)
		{
		if(mylock.tryLock())
		{
		for(int i=0;i<8;i++)
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
		
	}
	public static void main(String args[])
	{
		TryLockDemo1 ob=new TryLockDemo1();
		Thread t1=new Thread(ob,"first");
		Thread t2=new Thread(ob,"second");
		t1.start();
		t2.start();
	}
}