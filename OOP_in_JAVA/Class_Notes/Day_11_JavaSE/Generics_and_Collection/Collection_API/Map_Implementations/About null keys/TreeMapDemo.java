package core;


import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args)
	{
		Map<String,Integer>m1=new TreeMap<>();
		m1.put(null,100); // cannot have null
		System.out.println("TreeMap is\t"+m1);
		
	}

}
