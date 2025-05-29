import java.util.HashMap;
import java.util.Map;

public class HashMapBasicWorkingDemo 
{
	public static void main(String[] args) {
		Map<Integer,String> mymap=new HashMap<>();
		mymap.put(10,"Anil");
		mymap.put(20,"Sunita");
		mymap.put(30,"Vishal");
		System.out.println("Map is\t"+mymap);
		String name=mymap.get(30);
		System.out.println(name);
		name=mymap.get(40);
		System.out.println(name);
		mymap.put(10,"Reena");
		System.out.println("Map is\t"+mymap);
	}

}
