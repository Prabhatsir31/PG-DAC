import java.util.concurrent.*;
public class ExecutorDemo4
{
	public static void main(String args[])
	{
		Monitor m=new Monitor();
		Producer p=new Producer(m);
		Consumer c=new Consumer(m);			
ExecutorService exec=Executors.newFixedThreadPool(2);
		exec.execute(p);
		exec.execute(c);
	}
}
class Monitor
{
	int token;
	boolean value_set;
	synchronized public void set(int k)
	{
		while(value_set)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
			}
		}
		token=k;
		System.out.println("Set  "+token);
		notifyAll();
		value_set=true;
	}
	synchronized public int get()
	{
		while(!value_set)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
			}
		}
		value_set=false;
		System.out.println("Get  "+token);
		notifyAll();
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

	

