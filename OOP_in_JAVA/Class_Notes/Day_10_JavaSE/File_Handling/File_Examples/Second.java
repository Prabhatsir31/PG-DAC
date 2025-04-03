package java8;
import java.io.*;
public class Second
{
	public static void main(String args[])
	{
		try(FileOutputStream fos=new FileOutputStream("d:\\abc1.txt",true))
		{
		byte b[]=new byte[100];
		System.out.println("Enter data");
		int k=System.in.read(b);
		fos.write(b,0,k);
		
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}