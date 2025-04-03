


class Account
{
	private int id;  // instance member
	private String name;  // instance member
	private double balance; // instance member
	private static final int rate=8;  //  class variable as it is allocated memory as soon as class gets loaded

// let's have "parameterized constructor"

	public Account(int id,String name,double balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
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
public class AccountDemo10
{
	public static void main(String args[])
	{
		Account a1=new Account(1,"Prakash",10000);
		System.out.println(a1.getId()+"\t"+a1.getName()+"\t"+a1.getBalance()+"\t"+Account.getRate());
		Account a2=new Account(2,"Rajeev",2000);
		System.out.println(a2.getId()+"\t"+a2.getName()+"\t"+a2.getBalance()+"\t"+Account.getRate());

		// suppose one more customer has opened an account but we do not have any details at present and at the same time we want to show that we have 3 customers.
		Account a3=new Account();   // error as it requires default constructor which neither you have defined nor provided by compiler
		// details for a3 will be passed through "setters"

	}
}
