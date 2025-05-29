class Weapon
{
	void attack()
	{
		
	}
}
class Gun extends Weapon
{
	void attack()
	{
		System.out.println("attack with Gun");
	}
	void fillBullets()
	{
		System.out.println("filling bullets");
	}
}
class Bomb extends Weapon
{
	void attack()
	{
		System.out.println("attack with Bomb");
	}
}
class Sword extends Weapon
{
	void attack()
	{
		System.out.println("attack with Sword");
	}
}
public class WeaponDemo1_b
{
	static void perform(Weapon ref)
	{
// along with attack also invoke "fillBullets()" method of Gun
		// ref.fillBullets();  fillBullets() is not there inside // "Weapon" class, so u can't invoke it using Weapon class reference.

		Gun ob=new Gun();
		ob.fillBullets();  // but it's a different Gun
		ref.attack();   // polymorphic invokation
	}
	public static void main(String args[])
	{
		perform(new Gun());
		//perform(new Bomb());
		//perform(new Sword());
	}
}




















