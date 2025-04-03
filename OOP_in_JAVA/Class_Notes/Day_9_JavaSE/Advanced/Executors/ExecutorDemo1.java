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
		System.out.println("Hello\t"+i

+"\t"+Thread.currentThread());
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	}
}
public class ExecutorDemo1
{
	public static void main(String args[])
	{
		ExecutorService 

exec=Executors.newCachedThreadPool();

		for(int i=0;i<3;i++)
		{
			exec.execute(new myapp());
		}
System.out.println("After submitting tasks");


		System.out.println("After for loop");
		exec.execute(new myapp());

/*
shutdown() prevents new tasks from being submitted to that Executor. The current thread ( e.g. main thread  ) will continue to run all tasks submitted before shutdown() was called. 
*/
		exec.shutdown(); // if u don't invoke, then jvm will not shutdown
		System.out.println("done");
		// exec.execute(new myapp()); don't give any task after shutdown
		
	}
}			