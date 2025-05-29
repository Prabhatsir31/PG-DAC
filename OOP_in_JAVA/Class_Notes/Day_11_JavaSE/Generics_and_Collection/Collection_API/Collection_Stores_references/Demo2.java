import java.util.*;
import java.io.*;
class myclass implements Serializable
{
	int num;
	myclass(int num)
	{
		this.num=num;
	}
}
public class Demo2
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

		//m1.num=200;

		oos.writeObject(h); // copy of h and m1
		oos.close();
		fos.close();
		
		m1.num=300;

		System.out.println(m1.num);  // 300
		
		FileInputStream fis=new FileInputStream("my.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);

		Map<String,myclass> map=(HashMap<String,myclass>)ois.readObject();

		myclass ref=map.get("first");

		System.out.println(ref.num);  // 100
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
	}
}
