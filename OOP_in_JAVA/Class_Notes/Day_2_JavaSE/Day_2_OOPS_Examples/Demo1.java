class Account   // Developer
{
	// instance members
	private int acc_id;
	private String name;
	private double balance;
	private static int rate=9;

	public void setName(String name)     // member functions
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAcc_id(int acc_id)
	{
		this.acc_id=acc_id;
	}
	public int getAcc_id()
	{
		return acc_id;
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


// first customer has opened an account - Mr.A with 10000
// so we need to create an object

public class Demo1    // client
{
	public static void main(String args[])
	{
		Account a1=new Account();
		a1.setAcc_id(1);
		a1.setName("A");
		a1.setBalance(10000);

		Account a2=new Account();
		a2.setAcc_id(2);
		a2.setName("b");
		a2.setBalance(50000);
		System.out.println(a1.getAcc_id()+"\t"+a1.getName()+"\t"+a1.getBalance());
System.out.println(a2.getAcc_id()+"\t"+a2.getName()+"\t"+a2.getBalance());
		System.out.println(Account.getRate());
	}
}





