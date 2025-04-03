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

public class WeaponDemo1
{
	public static void main(String args[])
	{
		// create array of Weapon and store all child class objects, traverse through the array and invoke "attack()" polymorphically. Also wherever "Gun" object is there, invoke "fillBullets".
		Weapon arr[]=new Weapon[3];
		arr[0]=new Gun();
		arr[1]=new Sword();
		arr[2]=new Bomb();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof Gun)
			{
				Gun ref=(Gun)arr[i];
				ref.fillBullets();
			}
			arr[i].attack();
		}
	
	}
}