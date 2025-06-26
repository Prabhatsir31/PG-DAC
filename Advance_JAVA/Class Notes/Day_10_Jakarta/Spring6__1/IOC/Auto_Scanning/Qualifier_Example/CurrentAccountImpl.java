package mypack;

import org.springframework.stereotype.Component;

@Component(value="caccount")
public class CurrentAccountImpl implements Account 
{
	@Override
	public void deposit() 
	{
        System.out.println("inside current deposit");
	}

}
