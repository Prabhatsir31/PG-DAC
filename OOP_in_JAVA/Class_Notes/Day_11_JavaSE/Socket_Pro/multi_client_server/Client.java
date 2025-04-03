import java.io.*;
import java.net.*;
public class Client
{
	public static void main(String args[])
	{
		try
		{
			Socket ss=new Socket("LAPTOP-DM7E4AA9",8000);
			InputStream i=ss.getInputStream();
			DataInputStream dis=new DataInputStream(i);

			String str=dis.readUTF();
			System.out.println("Response from server is  "+str);
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}