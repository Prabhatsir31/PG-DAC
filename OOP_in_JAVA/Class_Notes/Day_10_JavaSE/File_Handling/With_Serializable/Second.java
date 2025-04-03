import static java.lang.System.*;
import java.io.*;
class base //implements Serializable
{
	int num1=30;
	base()
	{
		out.println("base const");
	}
}
class sub extends base implements Serializable
{
	int num2=60;
	sub()
	{
		out.println("sub const");
	}
}
public class Second
{
	public static void main(String args[])throws Exception
	{
		sub s=new sub();
		s.num1=100;
		s.num2=200;
		out.println("Before Saving\t"+s.num1+"\t"+s.num2);
		FileOutputStream fos=new FileOutputStream("my.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		s=null;
		FileInputStream fis=new FileInputStream("my.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		sub ref=(sub)ois.readObject();
		out.println("After Retrieving\t"+ref.num1+"\t"+ref.num2);
	}
}
		