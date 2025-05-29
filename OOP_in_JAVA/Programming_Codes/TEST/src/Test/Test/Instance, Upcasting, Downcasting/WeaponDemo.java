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
class Sword extends Weapon
{
	void attack()
	{
		System.out.println("attack with Sword");
	}
}
class Bomb extends Weapon
{
	void attack()
	{
		System.out.println("attack with Bomb");
	}
}

public class WeaponDemo
{
	public static void fight(Weapon w)
	{
		if(w instanceof Gun)
		{
			Gun ref=(Gun)w;
			ref.fillBullets();
		}
		w.attack();
	}
	public static void main(String args[])
	{
		fight(new Gun());
		fight(new Sword());
	}
}