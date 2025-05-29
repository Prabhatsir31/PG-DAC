import java.util.*;
import java.util.concurrent.*;
public class Second
{
	public static void main(String args[])
	{
		List<String> list= new CopyOnWriteArrayList<String>();
		list.add("vivek");
		list.add("kumar");
		System.out.println("Before modification\t"+list);
		Iterator i =list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			list.add("abhishek");
			//i.remove();// UnsupportedOperationException
		}
		System.out.println("after modification\t"+list);
	System.out.println("After modification:");
	Iterator i2 =list.iterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	}
}
