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
public class WeaponDemo1
{
	static void perform(Weapon ref)
	{
		ref.attack();   // polymorphic invocation
	}
	public static void main(String args[])
	{
		perform(new Gun());
		perform(new Bomb());
		perform(new Sword());
	}
}




















