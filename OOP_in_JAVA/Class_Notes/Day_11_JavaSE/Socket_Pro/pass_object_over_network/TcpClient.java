/*

here we have called "Thread.sleep(200)" 
if we don't call "sleep" then client socket gets closed as soon as client code is terminated and server gets exception "java.net.SocketException: Connection reset" while reading object from client.
with "sleep" method what we achieve is that when client invokes
"oos.writeObject(mylist)" , server application gets sufficient time to read that "mylist". This is because client socket gets closed only after "sleep(200)"
*/

import java.io.*;
import java.net.*;
import java.util.*;
public class TcpClient
{
	public static void main(String args[])
	{
		try
		{
			Socket ss=new Socket("LAPTOP-DM7E4AA9",10000);
			OutputStream o=ss.getOutputStream();
			
			ObjectOutputStream oos=new ObjectOutputStream(o);
			List<String>mylist=new ArrayList<String>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter book names to order for ,type quit to stop");
			while(true)
			{
				String str=sc.nextLine();
				if(str.equalsIgnoreCase("quit"))
				{
					break;
				}
				mylist.add(str);
			}
			oos.writeObject(mylist);
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}