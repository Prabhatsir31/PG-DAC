import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import java.io.*;
//Program to write and read in a file using RandomAccessFile 

//class
public class Sixth
{
	public static void main(String args[])
	{
		try(RandomAccessFile rf=new RandomAccessFile("e:\\temp\\xy.txt","rw"))
			{
			rf.seek(rf.length());
			System.out.println("Enter data");
			byte b[]=new byte[200];
			int k=System.in.read(b);
			rf.write(b,0,k);
			rf.seek(0);
			byte c[]=new byte[(int)rf.length()];
			rf.read(c);
			String ss=new String(c);
			System.out.println(ss);
			rf.seek(rf.length());
			System.out.println("Enter data again");
			k=System.in.read(b);
			rf.write(b,0,k);
			System.out.println("Finally reading all data");
			rf.seek(0);
			c=new byte[(int)rf.length()];
			rf.read(c);
			ss=new String(c);
			System.out.println(ss);
			}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}