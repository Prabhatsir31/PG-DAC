package Advance_multi;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
class loc implements Runnable
{
	ReentrantLock lock=new ReentrantLock();
	public void run()
	{
		lock.lock();
		perform();
		lock.unlock();
	}
	void perform()
	{
		for(char ch='A';ch<='J';ch++)
		{
			System.out.println(ch);
		}
		System.out.println("*************************");
	}
}
public class Ques3
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
