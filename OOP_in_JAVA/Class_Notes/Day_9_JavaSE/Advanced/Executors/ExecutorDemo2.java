/*
a FixedThreadPool uses a limited set of threads to execute the submitted tasks.
*/
import java.util.concurrent.*;
class myapp implements Runnable
{
	public void run()
	{
		perform();
	}
	void perform()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello\t"+i+"\t"+Thread.currentThread());
		}
	}
}
public class ExecutorDemo2
{
	public static void main(String args[])
	{
		ExecutorService exec=Executors.newFixedThreadPool(2);


		for(int i=0;i<3;i++)
		{
			exec.execute(new myapp());
		}
System.out.println("After submitting tasks");


		exec.shutdown();
	}
}			