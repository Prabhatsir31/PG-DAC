import java.util.*;
public class Test3 
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
		Test3 t=new Test3();
		t.disp(m);
		Integer ob=m.get(0);   // risk involved
		System.out.println(ob);

	}
}
