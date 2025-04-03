import java.util.*;
import static java.lang.System.*;
public class HashtableDemo
{
	public static void main(String args[])
	{
		Hashtable<String,Float> ht=new Hashtable<String,Float>();
		ht.put("first",45.8f);
		ht.put("second",67.3f);
		out.println(ht);
		Enumeration <String>e=ht.keys();
		while(e.hasMoreElements())
		{
			String s=e.nextElement();
			out.println(s+"\t"+ht.get(s));
		}

		Enumeration<Float> e1=ht.elements();
		while(e1.hasMoreElements())
		{
			out.printf("%f\n",e1.nextElement());
		}
		
		out.println("Displaying keys");
		Set<String> s=ht.keySet();
		Iterator <String>itr=s.iterator();
		while(itr.hasNext())
		{
			out.printf("%s\n",itr.next());
		}

		out.println("Modifying");
		float f=ht.get("second");
		out.println("second's old value is\t"+f);
		ht.put("second",f+30);
		out.println("second's new value is\t"+ht.get("second"));
	}
}