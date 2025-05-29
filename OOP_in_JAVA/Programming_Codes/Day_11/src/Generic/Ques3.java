/*
create LinkedList with the values 10,20,30 and 40.
display it.
now insert 500 in the beginning.
	insert 400 at 2nd position.
	add 1000 at the end.
display the list again.
*/
package Generic;


import java.util.*;

public class Ques3
{
	public static void main(String[] args)
	{
		List<Integer> mylist=new ArrayList<>();
		
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		
		mylist.addFirst(500);
		mylist.add(1, 400);
		mylist.addLast(1000);
		
		System.out.println(mylist);
	}
}
