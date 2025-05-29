public class Th4_a extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	public static void main(String args[])
	{
System.out.println(Thread.currentThread());
		Th4_a t1=new Th4_a();
		Th4_a t2=new Th4_a();
		t1.setName("first");
		t2.setName("second");
		t1.start();
		t2.start();
	}
}

