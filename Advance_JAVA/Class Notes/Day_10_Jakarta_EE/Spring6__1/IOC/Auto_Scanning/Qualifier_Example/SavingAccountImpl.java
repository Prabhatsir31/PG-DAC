package mypack;

import org.springframework.stereotype.Component;

@Component(value="saccount")
public class SavingAccountImpl implements Account 
{
	@Override
	public void deposit() 
	{
		System.out.println("inside saving deposit");
	}

}
