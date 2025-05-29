import java.util.*;
import java.util.concurrent.*;
public class First
{
	public final static void main(String args[])
	{
		List<String> list= new ArrayList<String>();
		list.add("vivek");
		list.add("kumar");
		Iterator i =list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			//list.add("abhishek"); // ConcurrentModificationException
		}
	}
}
