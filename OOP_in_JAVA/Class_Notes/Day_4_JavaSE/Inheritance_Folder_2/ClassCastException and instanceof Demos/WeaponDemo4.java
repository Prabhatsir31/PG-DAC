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
public class WeaponDemo4
{
	static void perform(Weapon ref)
	{
// along with attack also invoke "fillBullets()" method of Gun

	     if(ref instanceof Gun)
	     {
		Gun ob=(Gun)ref;    // downcasting
		ob.fillBullets();
	     }
		ref.attack();   // polymorphic invokation
	}
	public static void main(String args[])
	{
		perform(new Gun());
		perform(new Bomb());
		perform(new Sword());
	}
}




















