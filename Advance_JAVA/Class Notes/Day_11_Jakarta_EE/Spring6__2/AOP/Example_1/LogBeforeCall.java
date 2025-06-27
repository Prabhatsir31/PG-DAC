package mypack;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

// it's a "before" advice

public class LogBeforeCall implements MethodBeforeAdvice
{
    public void before(Method method, Object[] os, Object o) throws Throwable
    {
        System.out.println("Before Calling the Method");
    }
}

/*
Parameters:
    method - method being invoked (e.g. here "multiply")
    os - arguments to the method ( arg which will be passed to "multiply" method.
    o - target of the method invocation (object by which "multiply" method has been invoked). May be null ( in case of static method)

*/