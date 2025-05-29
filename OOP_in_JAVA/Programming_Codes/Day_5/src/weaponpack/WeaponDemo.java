package weaponpack;

class Weapon
{
	void attack()
	{
	}
	// some other stuff
}
class Sword extends Weapon
{
	void attack()
	{
		System.out.println("Sword attack");
	}
}
class Bomb extends Weapon
{
	void attack()
	{
		System.out.println("Bomb attack");
	}
}

class Gun extends Weapon
{
	void attack()
	{
		System.out.println("Gun attack");
	}
	void fillBullets() {
		System.out.println("Filling Bullets");
	}
}



class Soldier
{
	// program to implementation

	// Soldier class here is tightly coupled with a specific Weapon ie. Gun or Bomb or Sword
	// it gives us maintenance drawback

	//Gun ob=new Gun();  // Soldier has Gun
	//Bomb ob=new Bomb();
	
	public void fight(Weapon ref) {
		ref.attack();
	}
}

public class WeaponDemo
{
	public static void main(String args[])
	{
		Soldier s1=new Soldier();
		s1.fight(new Gun());
	}
}
