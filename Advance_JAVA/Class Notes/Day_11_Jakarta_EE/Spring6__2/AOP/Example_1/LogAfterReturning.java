package mypack;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
public class LogAfterReturning implements AfterReturningAdvice
{
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable 
    {
        System.out.println("After Normal Return from a method");
    }
}

/*

Parameters:
    o - the value returned by the method, if any
    method - method being invoked
    os - arguments to the method
    o1 - target of the method invocation. May be null.

*/
