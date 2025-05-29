/*
size() as well as get() methods invocation must happen together as one unit, no interference from other threads should be there, or else we’ll get the above exception.The fact that the individual methods are synchronized is irrelevant. In fact, we can go back to using the non-synchronized ArrayList, and the program ill work, as long as we synchronize properly to make thesize() and get() calls happen as one atomic, indivisible unit of execution:

*/

import java.util.*;
class HelloThread  
{

 int i=1;
 
  public  void go()
  {
 List arrayList=Collections.synchronizedList(new ArrayList());
	arrayList.add("hello");

 Thread thread1=new Thread(new Runnable() {

  public void run() 
  {
   synchronized(arrayList)
   {
	int size=arrayList.size();	  
try
{
	Thread.sleep(100);
}
catch(InterruptedException ie)
{
	ie.printStackTrace();
}
System.out.println(arrayList.get(size-1));
}
}
});
 thread1.start();
 Thread thread2=new Thread(new Runnable() 
 {
  public void run() 
  {
     synchronized(arrayList)
	{
	arrayList.remove(0);
	}
  }
 });
 thread2.start();
  
try
{
	thread1.join();
	thread2.join();
}
catch(InterruptedException ie)
{
	ie.printStackTrace();
}
System.out.println("ArrayList is\t"+arrayList);
 }
}

public class test1
{
  public static void main(String[] args)
  {
   HelloThread hello=new HelloThread();
   hello.go();
  }
}