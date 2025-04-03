package Advance_multi;

import java.util.concurrent.*;
class myap implements Runnable
{
	synchronized public void run()
	{
		perform();
	}
	void perform()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				try
				{
					wait();
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
			System.out.println(i);
			notifyAll();
		}
	}
}
public class Ques2
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
