import java.io.*;
public class First implements Serializable
{
	String name="sachin";
	int age=20;
	transient Thread t=new Thread();
	public static void main(String args[])
	{
			First s=new First();
			try(FileOutputStream fos=new FileOutputStream("e:\\ab1.txt"))
			{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
			oos.writeObject(s); //Serialization
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
System.out.println(s.name+"\t"+s.age+"\t"+s.t);
			s=null;

			try(FileInputStream fis=new FileInputStream("e:\\ab1.txt"))
			{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
			First s1=(First)ois.readObject();
// Deserialization
			System.out.println(s1.name +"\t"+s1.age+"\t"+s1.t);
			}
			}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
}
}			