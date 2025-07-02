package mypack;
public class AccountBean
{
    private Account account;
    public AccountBean()
    {
        System.out.println("in AccountBean no-arg constructor");
    }
    public void setAccount(Account account) 
    {
        System.out.println("inside setter method");
        this.account = account;
    }  
    public void makeDeposit()
    {
        account.deposit();
    }
}

