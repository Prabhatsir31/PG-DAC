import java.io.*;
public class DeserializeDemo
{
	public static void main(String args[])
	{
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
			Employee emp = (Employee) ois.readObject();

			System.out.println("Employee read is\t"+emp);
		}
		catch(Exception ie)	
		{
			ie.printStackTrace();
		}
	}
}
