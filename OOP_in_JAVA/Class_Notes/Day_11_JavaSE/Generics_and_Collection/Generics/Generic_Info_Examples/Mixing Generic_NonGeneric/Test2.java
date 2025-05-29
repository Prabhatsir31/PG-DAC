import java.util.*;
public class Test2 
{
	 void disp(List mylist)
	{
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		mylist.add(0,"hello");
	}
	public static void main(String args[])
	{
		List<Integer>m=new ArrayList<Integer>();
		m.add(20);
		m.add(40);
		Test2 t=new Test2();
		t.disp(m);
		System.out.println("in main\t"+m);
	}
}
