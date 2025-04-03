package Advance_multi;

import java.util.concurrent.*;
class myapp implements Runnable
{
	synchronized public void run()
	{
		perform();
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
public class Ques1
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




