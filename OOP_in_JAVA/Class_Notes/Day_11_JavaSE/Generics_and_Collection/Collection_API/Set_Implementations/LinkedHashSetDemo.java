/*LinkedHashSet is an extended version of HashSet. 
 * HashSet doesn’t follow any order where as LinkedHashSet 
 * maintains insertion order. HashSet uses HashMap object 
 * internally to store it’s elements where as LinkedHashSet 
 * uses LinkedHashMap object internally to store and 
 * process it’s elements. 
 * 
 *  */

package firstpro;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		Set<String> myset1=new HashSet<>();
		myset1.add("sachin");
		myset1.add("anil");
		myset1.add("rahul");
		System.out.println("HashSet is\t"+myset1);
		
		Set<String> myset2=new LinkedHashSet<>();
		myset2.add("sachin");
		myset2.add("anil");
		myset2.add("rahul");
		System.out.println("LinkedHashSet is\t"+myset2);
		
	}

}
