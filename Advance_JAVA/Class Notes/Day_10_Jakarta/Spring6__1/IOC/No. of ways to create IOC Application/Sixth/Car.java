package mypack;

public class Car 
{
	private Engine engine;
	
	
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}


	public String dispCar()
	{
		return "I am a car\t"+engine.dispEngine();
	}
	
}
