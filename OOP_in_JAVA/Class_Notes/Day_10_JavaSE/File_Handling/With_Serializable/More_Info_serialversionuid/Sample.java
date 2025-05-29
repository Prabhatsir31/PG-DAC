package core;

import java.io.*;

public class Sample {

	public static void main(String[] args)
	{
		First s=new First();
		try(FileOutputStream fos=new FileOutputStream("e:\\my.ser"))
		{
		try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
		oos.writeObject(s); //Serialization
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
System.out.println(s.name+"\t"+s.age+"\t"+s.t);
		s=null;

		try
		{
		FileInputStream fis=new FileInputStream("e:\\my.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		First s1=(First)ois.readObject();
//Deserialization
		System.out.println(s1.name +"\t"+s1.age+"\t"+s1.t);

Class<?> mainclass = s1.getClass();
Class<?> superclass=mainclass.getSuperclass();

        // Get the serialVersionUID using reflection
       
            ObjectStreamClass osc = ObjectStreamClass.lookup(mainclass);
            
            long serialVersionUID = osc.getSerialVersionUID();
            System.out.println("SerialVersionUID of First class " + mainclass.getName() + ": " + serialVersionUID);
            
            osc = ObjectStreamClass.lookup(superclass);
            long serialVersionUID1 = osc.getSerialVersionUID();
            System.out.println("SerialVersionUID of Base class " + superclass.getName() + ": " + serialVersionUID1);
     		}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}

	}

}
