import java.io.*;
import java.net.*;
public class TcpServer
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket sc=new ServerSocket(10000);
			Socket ss=sc.accept();
			InputStream i=ss.getInputStream();
			OutputStream o=ss.getOutputStream();
			DataOutputStream dos=new DataOutputStream(o);
			DataInputStream dis=new DataInputStream(i);
			byte b[]=new byte[200];
			String str="";
			while(true)
			{
				str=dis.readUTF();
				System.out.println("Request from client is  "+str);
				System.out.println("Enter response to client");
				int k=System.in.read(b);
				str=new String(b,0,k-2);
				dos.writeUTF(str);
				
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}