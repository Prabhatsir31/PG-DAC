// designed by Developer
class Account
{
	private int id;
	private String name,type;
	private double balance;

	private static final int rate=8;

	public static int getRate()
	{
		return rate;
	}

	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
}
public class AccountDemo
{
	public static void main(String args[])
	{
		Account a1=new Account();
		a1.setId(1);
		a1.setName("Abc");
		a1.setType("Saving");
		a1.setBalance(30000);

		System.out.println(a1.getId()+"\t"+a1.getName()+"\t"+a1.getType()+"\t"+a1.getBalance());
	
		
		Account a2=new Account();
		a2.setId(2);
		a2.setName("Xyz");
		a2.setType("Current");
		a2.setBalance(80000);

		System.out.println(a2.getId()+"\t"+a2.getName()+"\t"+a2.getType()+"\t"+a2.getBalance());

		System.out.println("Rate of interest is\t"+Account.getRate());

	}
}
























