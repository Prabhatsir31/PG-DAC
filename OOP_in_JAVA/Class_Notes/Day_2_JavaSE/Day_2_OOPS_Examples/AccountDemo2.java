

// we need one more member inside Account class i.e. "rate", so how can we add it inside "Account" class?

class Account
{
	private int id;
	private String name;
	private double balance;
	private int rate;

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
	public void setRate(int rate)
	{
		this.rate=rate;
	}
	public int getRate()
	{
		return rate;
	}
}
public class AccountDemo2
{
	public static void main(String args[])
	{
		Account a1=new Account();
		a1.setId(1);
		a1.setName("Prakash");
		a1.setBalance(10000);
		a1.setRate(8);
		System.out.println(a1.getId()+"\t"+a1.getName()+"\t"+a1.getBalance()+"\t"+a1.getRate());
		Account a2=new Account();
		a2.setId(2);
		a2.setName("Rajeev");
		a2.setBalance(2000);
		a2.setRate(8);
		System.out.println(a2.getId()+"\t"+a2.getName()+"\t"+a2.getBalance()+"\t"+a2.getRate());
	}
}
