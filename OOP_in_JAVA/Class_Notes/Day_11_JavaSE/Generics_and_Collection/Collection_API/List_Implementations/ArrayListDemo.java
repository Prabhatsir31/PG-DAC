import java.util.*;
import static java.lang.System.*;
public class ArrayListDemo
{
	public static void main(String args[])
	{
		List <String>a1=new ArrayList<String>();
		out.println("Initial size of a1:  "+a1.size());
		a1.add("c");
		a1.add("a");
		a1.add("e");
		a1.add("b");
		a1.add("d");
		a1.add("f");
		a1.add(1,"a2");
		out.println("After adding size of a1:  "+a1.size());
			out.println("Contents of a1:  "+a1);
			a1.remove("f");
			a1.remove(2);
		out.println("After removing size of a1:  "+a1.size());
			out.println("Contents of a1:  "+a1);
	}






}