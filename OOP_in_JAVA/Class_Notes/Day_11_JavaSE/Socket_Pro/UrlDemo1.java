import java.net.*;
import java.io.*;
import java.util.*;
public class UrlDemo1
{
	public static void main(String args[])
	{
		try
		{
		URL u=new URL("https://www.facebook.com/");
URLConnection con=u.openConnection();

long d=con.getDate();
if(d==0)
{
	System.out.println("No Date Information");
}
else
{
	System.out.println("Date is\t"+new Date(d));
}			
System.out.println("Content type is\t"+con.getContentType());

int len=con.getContentLength();
if(len!=0)
{
	System.out.println("contents are");

	InputStream input=con.getInputStream();
	int ch;
	while((ch=input.read())!=-1)
	{
		System.out.print((char)ch);
	}
}
else
{
	System.out.println("no contents are available");
}

}
		catch(Exception mm)
		{
			System.out.println("Exception is\t"+mm);
		}
	}
}
