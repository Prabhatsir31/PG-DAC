//sort map values in descending order

import java.util.HashMap;
import java.util.Map;

public class Demo6
{
	public static void main(String ...arg)
	{
		Map<String,String>mymap = new HashMap<String,String>();
		mymap.put("1","xyz");
		mymap.put("2","pqr");
		mymap.put("3","abc");

		
		System.out.println();
		mymap.values().stream().sorted().forEach(System.out::println);
		System.out.println("*************************");
		mymap.values().stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		
	}
}

