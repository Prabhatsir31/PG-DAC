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
public class WeaponDemo1_a
{
	static void perform(Weapon ref)
	{
// along with attack also invoke "fillBullets()" method of Gun
		ref.fillBullets();
		ref.attack();   // polymorphic invocation
	}
	public static void main(String args[])
	{
		perform(new Gun());
		//perform(new Bomb());
		//perform(new Sword());
	}
}




















