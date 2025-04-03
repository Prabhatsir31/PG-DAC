/*
with class lock
*/
import java.util.concurrent.*;
class myapp implements Runnable
{
	synchronized static void disp()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello\t"+i

+"\t"+Thread.currentThread());
		}
	}

	public void run()
	{
		disp();
	}
}
public class ExecutorDemo3
{
	public static void main(String args[])
	{
		//myapp m=new myapp();
		ExecutorService exec=Executors.newFixedThreadPool(2);
		for(int i=0;i<3;i++)
		{
		//	exec.execute(m);
			exec.execute(new myapp());
		}
		exec.shutdown();
	}
}			