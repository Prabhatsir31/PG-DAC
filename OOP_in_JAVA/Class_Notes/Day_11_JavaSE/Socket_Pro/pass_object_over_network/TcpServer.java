import java.io.*;
import java.net.*;
import java.util.*;
public class TcpServer
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket sc=new ServerSocket(10000);
			Socket ss=sc.accept();
			InputStream i=ss.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(i);
			List list=(List)ois.readObject();
			System.out.println("Order from client is\t"+list);
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}