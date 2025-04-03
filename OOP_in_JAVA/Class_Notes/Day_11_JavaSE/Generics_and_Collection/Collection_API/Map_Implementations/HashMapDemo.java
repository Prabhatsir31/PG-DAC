package datatypes_pro;

import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo
{
	public static void main(String args[])
	{
		Map <String,Double>h=new HashMap<String,Double>();
		h.put("john",3434.34);
		h.put("tom",123.12);
		h.put("jane",1378.00);
		h.put("todd",99.22);
		// get a set of entries
		Set<Entry<String,Double>> set=h.entrySet();
		// get an iterator
		Iterator<Entry<String, Double>> i=set.iterator();
		// display elements
		while(i.hasNext())
		{
			Map.Entry<String,Double> me=(Entry<String, Double>)i.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());
		}
		System.out.println();
		//deposit 1000 in john's account
		double balance=h.get("john");
		h.put("john",balance+1000);
		System.out.println("john's new balance  "+h.get("john"));
	}
}