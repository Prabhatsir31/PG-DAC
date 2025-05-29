/* while creating t1, we are passing anonymous 
object of Runnable implementation */
package core1;
class Monitor
{
	synchronized void disp1()
	{
		for(int i=0;i<5;i++)
		{		System.out.println("Hello\t"+Thread.currentThread().getName());
		}
	}

	synchronized void disp2()
	{
		for(int i=0;i<5;i++)
		{		System.out.println("Welcome\t"+Thread.currentThread().getName());
		}
	}
}
public class Demo5
{
	public static void main(String args[])
	{
		Monitor m=new Monitor();
		Thread t1=new Thread(()->{m.disp1();},"FirstThread");
		
		Runnable ref=()->{m.disp2();};
		System.out.println("Implementation class of Runnable is\t"+ref.getClass().getName());

		Thread t2=new Thread(ref,"SecondThread");
			t1.start();
			t2.start();
	}
}








