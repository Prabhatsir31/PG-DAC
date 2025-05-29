import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



public class Third_a {

	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList<>();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		System.out.println("Using Iterator");
		Iterator<Integer> itr=mylist.iterator();
		while(itr.hasNext())
		{
			int k=itr.next();
			if(k==20)
			{
				itr.remove(); // It's possible
				//mylist.remove(1); // not possible
			}
			System.out.println(k);
		}
		

		System.out.println("mylist is\t"+mylist);
	}

}
