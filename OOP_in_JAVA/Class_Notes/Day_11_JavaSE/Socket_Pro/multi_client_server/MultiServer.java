import java.io.*;
import java.net.*;
class mythread extends Thread
{
	Socket mySocket;
	DataOutputStream dos;
	mythread(Socket mySocket)
	{
		this.mySocket=mySocket;
		try
		{
			dos=new DataOutputStream(mySocket.getOutputStream());
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

	public void run()
	{
		try
		{
			dos.writeUTF("Welcome to our site");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}

	}
}

public class MultiServer
{
	public static void main(String args[])
	{
		try
		{
		ServerSocket ss=new ServerSocket(8000);
		while(true)
		{
			Socket s=ss.accept();
			System.out.println(s.getInetAddress().getHostName()+"\tgot connected");
			new mythread(s).start();


		}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}










