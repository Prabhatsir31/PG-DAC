
/* "remove()" operation is not allowed in case of Iterator of
 * CopyOnWriteArrayList
 * 
 *  */
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Third {

	public static void main(String[] args) {
		List<Integer> mylist = new CopyOnWriteArrayList<>();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		System.out.println("Using Iterator");
		Iterator<Integer> itr = mylist.iterator();
		while (itr.hasNext()) {
			int k = itr.next();
			if (k == 20) {
				itr.remove(); // UnsupportedOperationException
			}
			System.out.println(k);
		}
	}
}
