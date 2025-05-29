import java.io.*;
import java.net.*;
public class UdpServer
{
	static int port=5000;
	public static void main(String args[])
	{
		try
		{
			

			DatagramSocket sock=new DatagramSocket(port);
			while(true)
			{
			byte data[]=new byte[100];
			DatagramPacket pack=new DatagramPacket(data,data.length);
				
				sock.receive(pack);
				String ss=new String(data,0,pack.getLength());
			System.out.println(ss);
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}









