import java.util.*;
class one 
{
	void disp1()
	{
		System.out.println("in disp1");
	}
}
class two
{
	void disp2()
	{
		System.out.println("in disp2");
	}
}
class three
{
	void disp3()
	{
		System.out.println("in disp3");
	}
}

public class ReflectionDemo2
{
 static Object createObject(String className) 
{
      Object object = null;
      try {
          Class classDefinition = Class.forName(className);
          object = classDefinition.newInstance();
      } 
	catch (InstantiationException e) // if there is no default constr
	{
          System.out.println(e);
      	} 
	catch (IllegalAccessException e) // if constr is not accessible
	 {
          System.out.println(e);
      	}
	 catch (ClassNotFoundException e)
	 {
          System.out.println(e);
     	 }
      return object;
   }


	public static void main(String args[])
	{
		try
		{
			System.out.println("Enter class name which you want to instantiate");
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			Object ob=createObject(str);
			if(ob instanceof one)
			{
				((one)(ob)).disp1();
			}
			else if(ob instanceof two)
			{
				((two)(ob)).disp2();
			}
			else if(ob instanceof three)
			{
				((three)(ob)).disp3();
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}