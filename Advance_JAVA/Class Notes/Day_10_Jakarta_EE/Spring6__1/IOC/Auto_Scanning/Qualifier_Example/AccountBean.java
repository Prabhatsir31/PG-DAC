package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="accountbean")
public class AccountBean
{
	@Autowired
	@Qualifier("caccount")
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

