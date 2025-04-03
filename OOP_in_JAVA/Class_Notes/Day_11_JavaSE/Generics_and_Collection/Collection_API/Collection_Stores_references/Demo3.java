import java.util.*;
import java.io.*;
class myclass implements Serializable
{
	int num;
	myclass(int num)
	{
		this.num=num;
	}
	public String toString()
	{
		return ""+num;
	}
}
public class Demo3
{
	public static void main(String args[])
	{
		try
		{
		Map<String,myclass>h=new HashMap<String,myclass>();

		FileOutputStream fos=new FileOutputStream("my.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		
		myclass m1=new myclass(100);
		System.out.println(m1.num); // 100
		h.put("first",m1);

		
		oos.writeObject(h); // copy of h and m1
		oos.close();
		fos.close();
		
		myclass m2=new myclass(500);
		h.put("second",m2);

		m1.num=300;

		System.out.println(m1.num);  // 300
		
		FileInputStream fis=new FileInputStream("my.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);

		Map<String,myclass> map=(HashMap<String,myclass>)ois.readObject();

		myclass ref=map.get("first");

		System.out.println(ref.num);  // 100


		System.out.println("h is\t"+h);
		System.out.println("map is\t"+map);
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
	}
}
