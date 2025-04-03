import java.io.*;
import java.util.*;
public class Demo
{
	public static void main(String args[])
	{
		try
		{
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers, 0 to quit");
		while(true)
		{
			int k=sc.nextInt();
			if(k==0)
			{
				break;
			}
			dos.writeInt(k);
		}
		dos.close();
		fos.close();

		FileInputStream fis=new FileInputStream("xyz.txt");
		DataInputStream dis=new DataInputStream(fis);
		while(dis.available()>0)
		{
			System.out.println(dis.readInt());
		}
		dis.close();
		fis.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	}
}