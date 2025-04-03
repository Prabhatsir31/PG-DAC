import java.util.HashMap;
import java.util.Map;

public class Demo5
{
	public static void main(String ...arg)
	{
		Map<String,String>mymap = new HashMap<String,String>();
		mymap.put("1","xyz");
		mymap.put("2","pqr");
		mymap.put("3","abc");

		
		System.out.println();
		mymap.keySet().stream().sorted().forEach(System.out::println);
		mymap.values().stream().sorted().forEach(System.out::println);
		
	}
}
