class Weapon
{
	void attack()
	{
	}
	// some other stuff
}
class Gun extends Weapon
{
	void attack()
	{
		System.out.println("Gun attack");
	}
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

class Soldier
{
	

	// Soldier class here is loosely coupled with a specific Weapon ie. Gun or Bomb or Sword
	// it gives us maintenance advantage

	Weapon ref;    // program to interface
	void fight(Weapon ref)
	{
		this.ref=ref;
		ref.attack();
	}
}

public class SoldierDemo2
{
	public static void main(String args[])
	{
		Soldier s1=new Soldier();
		s1.fight(new Gun());
		// or
		s1.fight(new Sword());
	}
}