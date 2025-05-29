import java.io.*;
import java.util.*;
public class FileDemo
{
	public static void main(String args[])
	{
		File f=new File("c:\\temp\\FileDemo.java");
		System.out.println("File Name\t"+f.getName());
		System.out.println("Path\t"+f.getPath());
		System.out.println("Abs Path\t"+f.getAbsolutePath());
		System.out.println(f.exists()?"Exists":"Doesn't Exists");
		System.out.println(f.canWrite()?"Can Write":"Can Not Write");
		System.out.println(f.canRead()?"Can Read":"Can Not Read");
		System.out.println(f.isDirectory()?"It is Directory":"It is not Directory");
		System.out.println(f.isFile()?"Yes File":"No File");
		System.out.println(f.isAbsolute()?"is Absolute":"It is Not Absolute");
		System.out.println("File Last Modified\t"+new Date(f.lastModified()));
		System.out.println("File size is\t"+f.length());
	}
}
		