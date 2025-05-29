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

public class Electronic_Demo2
{
	public static void main(String args[])
	{
		Electronic_Appliance arr[]=new Electronic_Appliance[3];
		arr[0]=new TV();
		arr[1]=new Refrigerator();
		arr[2]=new Washing_Machine();

		for(int i=0;i<arr.length;i++)
		{
		if(arr[i] instanceof Washing_Machine)
			{
				Washing_Machine w=(Washing_Machine)arr[i];
				w.fillWater();
			}
			arr[i].on();

			arr[i].off();
		}
	}
}
