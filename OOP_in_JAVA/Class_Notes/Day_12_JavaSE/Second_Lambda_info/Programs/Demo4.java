package core1;
/* while creating t1, we are passing anonymous 
object of Runnable implementation */
public class Demo4
{
	public static void main(String args[])
	{
		Thread t1=new Thread(()->{for(int i=0;i<5;i++)
						{
					System.out.println("Hello\t"+Thread.currentThread().getName());
						}
					  },"First");
		
Runnable ref=()->{for(int i=0;i<5;i++)
{
System.out.println("Welcome\t"+Thread.currentThread().getName());
}
};
		Thread t2=new Thread(ref,"Second");
			t1.start();
			t2.start();
			System.out.println("name of ref implementation is\t"+ref.getClass().getName());
			
	}
}



