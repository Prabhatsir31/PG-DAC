import java.io.*;
// Program to write and read primitives in file
/* DataOutputStream lets an application write primitive Java data types to an output stream in a portable way. An application can then use a data input stream to read the data back in. */

/* DataInputStream lets an application read primitive Java data types from an underlying input stream in a machine-independent way. An application uses a data output stream to write data that can later be read by a data input stream.
*/

public class Fourth
{
	public static void main(String args[])
	{
		try(FileOutputStream fos=new FileOutputStream("ab1.txt"))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{
				dos.writeInt(10);
				dos.writeChar('A');
				dos.writeFloat(3.9f);
				dos.writeBoolean(true);
				dos.writeUTF("hello world");
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}

		try(FileInputStream fis=new FileInputStream("ab1.txt"))
		{
		try(DataInputStream dis=new DataInputStream(fis))
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}




























			