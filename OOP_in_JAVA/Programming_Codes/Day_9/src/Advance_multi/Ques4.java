package Advance_multi;


import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
class rent implements Runnable
{
	ReentrantLock lock=new ReentrantLock();
	Condition c=lock.newCondition();
	public void run()
	{
		lock.lock();
		perform();
		lock.unlock();
	}
	void perform()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				System.out.println("*************************");
				try {
					c.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
			c.signalAll();
		}
		System.out.println("*************************");
	}
}
public class Ques4
{
	public static void main(String args[])
	{
		ExecutorService exec=Executors.newFixedThreadPool(2);

		myapp m=new myapp();
		for(int i=0;i<2;i++)
		{
			exec.execute(m);
		}

		exec.shutdown();
	}
}