//package core1;
import java.util.*;

/*Array Double Ended Queue or Array Deck
This is a special kind of array that grows 
and allows users to add or remove an element 
from both sides of the queue. */

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> a1=new ArrayDeque<>();
		a1.add(100);
		a1.add(200);
		System.out.println(a1);
		a1.addFirst(300);
		System.out.println(a1);
		a1.addLast(500);
		System.out.println(a1);
		a1.add(600);
		System.out.println(a1);
		a1.remove(); 
		System.out.println(a1);
		a1.removeLast();
		System.out.println(a1);
    }
}
