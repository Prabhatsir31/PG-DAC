import java.io.*;
import java.net.*;
public class UdpClient
{
	static int port=5000;
	public static void main(String args[])
	{
		try
		{
			byte data[]=args[1].getBytes();
			InetAddress id=InetAddress.getByName(args[0]);
			System.out.println(id);
			DatagramPacket pack=new DatagramPacket(data,data.length,id,port);
			DatagramSocket sock=new DatagramSocket();
			sock.send(pack);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}