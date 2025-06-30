package mypack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect 
{
	 @Pointcut("execution(* BookNewController.*(..))")  
	 public void beforepointcut(){}//pointcut name 
	 
	 @Pointcut("execution(* BookNewController.*(..))")  
	 public void afterpointcut(){}//pointcut name
	      
	    @Before("beforepointcut()") //applying pointcut on before advice  
	    public void myadvice1(JoinPoint jp)//it is advice (before advice)  
	    {  
	        System.out.println("Before the method");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	    }  
	    
	    @After("afterpointcut()")
	    public void myadvice2(JoinPoint jp)//it is advice (after advice)  
	    {  
	        System.out.println("After the method");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	    }  
}
