class Account
{
	private int id;
	private String name;
	private double balance;

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
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
}
public class AccountDemo1
{
	public static void main(String args[])
	{
		Account a1=new Account();
		a1.setId(1);
		a1.setName("Prakash");
		a1.setBalance(10000);
		System.out.println(a1.getId()+"\t"+a1.getName()+"\t"+a1.getBalance());
		Account a2=new Account();
		a2.setId(2);
		a2.setName("Rajeev");
		a2.setBalance(2000);
		System.out.println(a2.getId()+"\t"+a2.getName()+"\t"+a2.getBalance());
	}
}
