import java.io.*;
public class Third
{
	public static void main(String args[])
	{
		char arr1[]=null;
		try(FileWriter fw=new FileWriter("e:\\abc2.txt"))
		{
		char arr[]={'a','b','c','d','e'};
		fw.write(arr);
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		try(FileReader fr=new FileReader("e:\\abc2.txt"))
		{

		arr1=new char[(int)new File("e:\\abc2.txt").length()];
		fr.read(arr1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}





























			