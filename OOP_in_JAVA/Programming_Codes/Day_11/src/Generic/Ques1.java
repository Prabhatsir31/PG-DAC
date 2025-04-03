/*
accept 10 numbers from user and add them inside the ArrayList.
using ListIterator display all the numbers bidirectionally.
*/
package Generic;

import java.util.*;

public class Ques1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int[] arr=new int[10];
		
		List<Integer> mylist=new ArrayList<>();
		
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			mylist.add(arr[i]);	
		}
		
		Iterator<Integer> itr=mylist.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}
