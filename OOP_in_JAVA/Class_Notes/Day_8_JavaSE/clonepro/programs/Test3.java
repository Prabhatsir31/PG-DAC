class Engine
{
	private int speed;

	public Engine(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Engine [speed=" + speed + "]";
	}
	
}
class Car implements Cloneable
{
	private Engine ref;
	private String name;
	public Car(String name) {
		super();
		this.name = name;
		this.ref=new Engine(100);
	}
	public Engine getRef() {
		return ref;
	}
	public void setRef(Engine ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object clone()
	{
		Car ob=null;
		try {
			 ob=(Car)super.clone();
		}
		catch (CloneNotSupportedException e) 
		{
			
			e.printStackTrace();
		}
		ob.ref=new Engine(ref.getSpeed());
		return ob;
	}
	@Override
	public String toString() {
		return "[name=" + name + " ref=" + ref + "]";
	}
	
}
public class Test3
{
  public static void main(String[] args)
  {
	  Car c=new Car("Nano");
	  Car c1=(Car)c.clone();
	  System.out.println(c);
	  System.out.println(c1);
	  
	  c1.getRef().setSpeed(400);
	  
	  System.out.println("After Modification");
	  
	  System.out.println(c);
	  System.out.println(c1);
  }
}







