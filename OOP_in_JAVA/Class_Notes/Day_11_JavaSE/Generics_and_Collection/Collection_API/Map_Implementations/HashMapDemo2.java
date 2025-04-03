package datatypes_pro;

import java.util.*;
import java.io.*;
class MyClass implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int num;
	MyClass(int num)
	{
		this.num=num;
	}
}
public class HashMapDemo2
{
	public static void main(String args[])
	{
		try
		{
		Map<String,MyClass>h=new HashMap<String,MyClass>();

		FileOutputStream fos=new FileOutputStream("my.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		
		MyClass m1=new MyClass(100);
		System.out.println(m1.num); // 100
		h.put("first",m1);

		//m1.num=200;

		oos.writeObject(h); // copy of h and m1
		oos.close();
		fos.close();
		
		m1.num=300;

		System.out.println(m1.num);  // 300
		
		FileInputStream fis=new FileInputStream("my.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);

		Map<?,?> map=(Map<?,?>)ois.readObject();

		MyClass ref=(MyClass) map.get("first");

		System.out.println(ref.num);  // 100
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
		
	}
}
