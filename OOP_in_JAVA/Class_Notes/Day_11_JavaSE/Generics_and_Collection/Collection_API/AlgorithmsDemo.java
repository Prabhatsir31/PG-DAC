import java.util.*;
import static java.lang.System.*;
public class AlgorithmsDemo
{
	public static void main(String args[])
	{
		LinkedList <Integer>l=new LinkedList<Integer>();
		l.add(-8);
		l.add(20);
		l.add(-20);
		l.add(8);
		//create a reverse order comparator
		Comparator <Integer>c=Collections.reverseOrder();
		//sort list by using the comparator
		Collections.sort(l,c);
		// get iterator
		Iterator <Integer>itr=l.iterator();
		System.out.println("List sorted in reverse  ");
		while(itr.hasNext())
		{
			System.out.print(itr.next() +" ");
		}
		System.out.println();
		Collections.shuffle(l);
		// display randomize list
		itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() +" ");
		}
		System.out.println();
		Collections.shuffle(l);
		// display randomize list
		itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() +" ");
		}
		System.out.println();

		System.out.println("Mininum  "+Collections.min(l));
		System.out.println("Maximum  "+Collections.max(l));	

System.out.println("Now without Comparator");
LinkedList <Integer>l1=new LinkedList<Integer>();
		l1.add(-8);
		l1.add(20);
		l1.add(-20);
		l1.add(8);
		//create a reverse order comparator

		//sort list without the comparator
		Collections.sort(l1);
		// get iterator
		Iterator <Integer>itr1=l1.iterator();
		System.out.println("List sorted ");
		while(itr1.hasNext())
		{
			System.out.print(itr1.next() +" ");
		}

	}
}	
		
