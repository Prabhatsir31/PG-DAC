package core;
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
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class Test1
{
 
public static void main(String[] args)
  {
	  Car c=new Car("Nano");
	  try {
		c.clone();
		} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	  System.out.println("Done");
  }


}
