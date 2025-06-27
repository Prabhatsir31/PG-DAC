package mypack;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
public class LogAfterReturning implements AfterReturningAdvice 
{
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable 
			{
		// TODO Auto-generated method stub
		System.out.println("After Normal Return from a method\t"+arg1.getName());
	}

}
