import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1
{
	public static void main(String[] args) {
		Map<Integer,String>mymap=new TreeMap<Integer,String>();
		mymap.put(3,"hello");
		mymap.put(2,"welcome");
		mymap.put(1,"hi");
		mymap.put(2,"good bye");
		System.out.println(mymap);
	}

}
