import java.util.concurrent.locks.*;
public class Transaction
{
	public static void main(String args[])
	{
		Monitor m=new Monitor();
		Producer p=new Producer(m);
		Consumer c=new Consumer(m);
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
	}
}
class Monitor
{
	ReentrantLock mylock=new ReentrantLock();
	Condition value=mylock.newCondition();
	int token;
	boolean value_set;
	public void set(int k)
	{
		mylock.lock();
		while(value_set)
		{
			try
			{
				value.await();
			}
			catch(InterruptedException ie)
			{
			}
		}
		token=k;
		System.out.println("Set  "+token);
		value.signalAll();
		value_set=true;
		mylock.unlock();
	}
	public int get()
	{
		mylock.lock();
		while(!value_set)
		{
			try
			{
				value.await();
			}
			catch(InterruptedException ie)
			{
			}
		}
		value_set=false;
		System.out.println("Get  "+token);
		value.signalAll();
		mylock.unlock();
		return token;
	}
}
class Producer implements Runnable
{
	Monitor obj;
	Producer(Monitor obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			obj.set(i++);
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ie)
			{
			}
		}
	}
}
class Consumer implements Runnable
{
	Monitor obj;
	Consumer(Monitor obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		while(true)
		{
			obj.get();
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ie)
			{
			}
		}
	}
}

	

