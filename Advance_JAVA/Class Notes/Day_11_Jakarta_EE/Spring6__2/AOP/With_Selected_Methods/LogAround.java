package mypack;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor
{
    public Object invoke(MethodInvocation mi) throws Throwable
    {
        Object arg[]=mi.getArguments();
        int num1=(Integer)arg[0];
        int num2=(Integer)arg[1];
        if(num1==0 && num2==0)
        {
            throw new Exception("Cannot Multiply 0 with 0");
        }
            return mi.proceed();
        }
    }
