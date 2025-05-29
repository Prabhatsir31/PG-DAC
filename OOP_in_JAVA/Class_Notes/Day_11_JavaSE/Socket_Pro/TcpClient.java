import java.io.*;
import java.net.*;
public class TcpClient
{
	public static void main(String args[])
	{
		try
		{
			Socket ss=new Socket("LAPTOP-DM7E4AA9",10000);
			InputStream i=ss.getInputStream();
			OutputStream o=ss.getOutputStream();
			DataOutputStream dos=new DataOutputStream(o);
			DataInputStream dis=new DataInputStream(i);
			byte b[]=new byte[200];
			String str="";
			while(true)
			{
				System.out.println("Enter request to server");
				int k=System.in.read(b);
				str=new String(b,0,k-2);
				dos.writeUTF(str);
				str=dis.readUTF();
				System.out.println("Response from server is  "+str);
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}