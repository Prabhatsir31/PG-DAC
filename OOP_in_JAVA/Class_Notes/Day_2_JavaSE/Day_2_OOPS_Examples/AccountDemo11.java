


class Account
{
	private int id;  // instance member
	private String name;  // instance member
	private double balance; // instance member
	private static final int rate=8;  //  class variable as it is allocated memory as soon as class gets loaded

// Constructor overloading

	public Account(int id,String name,double balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public Account()
	{
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
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public static int getRate()
	{
		return rate;
	}
}
public class AccountDemo11
{
	public static void main(String args[])
	{
		Account a1=new Account(1,"Prakash",10000);
		System.out.println(a1.getId()+"\t"+a1.getName()+"\t"+a1.getBalance()+"\t"+Account.getRate());
		Account a2=new Account(2,"Rajeev",2000);
		System.out.println(a2.getId()+"\t"+a2.getName()+"\t"+a2.getBalance()+"\t"+Account.getRate());

		// suppose one more customer has opened an account but we do not have any details at present and at the same time we want to show that we have 3 customers.
		Account a3=new Account();   
		// details for a3 will be passed through "setters"
		a3.setId(3);
		a3.setName("Sachin");
		a3.setBalance(5000);
System.out.println(a3.getId()+"\t"+a3.getName()+"\t"+a3.getBalance()+"\t"+Account.getRate());


	}
}
