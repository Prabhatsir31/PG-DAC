package mypack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class EmployeeDAOFileImpl implements EmployeeDAO {

	@Override
	public void insertEmployee(Employee ref) 
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("d:\\trial.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ref);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	@Override
	public Employee getEmployee() 
	{
		Employee ref=null;
		try
		{
			FileInputStream fos=new FileInputStream("d:\\trial.txt");
			ObjectInputStream ois=new ObjectInputStream(fos);
			ref=(Employee)ois.readObject();
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		return ref;
	}

}
