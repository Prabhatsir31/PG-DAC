/*

when u say 

List arrayList=Collections.synchronizedList(new ArrayList());

we think that the resulting List will be synchronized, and therefore can be considered safe.

Not really. 

Well, individual method calls of synchronized List and Vector are synchronized. In the following example,as soon as size() method is completed by one thread (lock will be released), other thread can invoke remove() method. Now when first thread will try to invoke get() "IndexOutOfBoundsException" will come because there is no element exists.


Solution:
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
});
 thread1.start();
 Thread thred2=new Thread(new Runnable() 
 {
  public void run() 
  {
	arrayList.remove(0);
  }
 });
 thred2.start();
  }
 }

public class test
{
  public static void main(String[] args)
  {
   HelloThread hello=new HelloThread();
   hello.go();
  }
}