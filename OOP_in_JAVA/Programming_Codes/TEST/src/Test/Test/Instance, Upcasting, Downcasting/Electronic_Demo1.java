class Electronic_Appliance
{
	void on()
	{
	}
	void off()
	{
	}
}
class TV extends Electronic_Appliance
{
	void on()
	{
		System.out.println("TV on");
	}
	void off()
	{
		System.out.println("TV off");
	}
}

class Refrigerator extends Electronic_Appliance
{
	void on()
	{
		System.out.println("Refrigerator on");
	}
	void off()
	{
		System.out.println("Refrigerator off");
	}
}
class Washing_Machine extends Electronic_Appliance
{
	void on()
	{
		System.out.println("Washing_Machine on");
	}
	void off()
	{
		System.out.println("Washing_Machine off");
	}
	void fillWater()
	{
		System.out.println("filling water");
	}
}

public class Electronic_Demo1
{
	static void perform(Electronic_Appliance ref)
	{
		ref.on();
		ref.off();
		if(ref instanceof Washing_Machine)
		{
			Washing_Machine w=(Washing_Machine)ref;
			w.fillWater();
		}
	}
	public static void main(String args[])
	{
		perform(new TV());
		//perform(new Refrigerator());
		perform(new Washing_Machine());
	}
}
