

// developer part
class Singleton
{
	private static Singleton obj=new Singleton();

	private Singleton()
	{
	}

	void disp1()
	{
		System.out.println("in disp1");
	}
	void disp2()
	{
		System.out.println("in disp2");
	}

	// provide a method which will return "obj"
	public static Singleton getSingleton()
	{
		return obj;
	}
}

// client part
public class SingletonDemo
{
	public static void main(String args[])
	{
		// Singleton s1=new Singleton(); // not allowed
		// Singleton ref=Singleton.obj;   // not possible

		Singleton ref=Singleton.getSingleton();
		ref.disp1();
		ref.disp2();
		Singleton.getSingleton().disp1();

		
	}
}




