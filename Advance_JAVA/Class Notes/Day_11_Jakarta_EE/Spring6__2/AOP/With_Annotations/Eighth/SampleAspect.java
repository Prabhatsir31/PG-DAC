package mypack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect 
{
	 @Pointcut("execution(* Sample.set*(..))")  
	 public void beforepointcut(){}//pointcut name 
	 
	 @Pointcut("execution(* get*(..))")  
	 public void afterpointcut(){}//pointcut name
	 
	 @Pointcut("execution(* to*(..))")  
	 public void aroundpointcut(){}//pointcut name
	 
	
	      
	    @Before("beforepointcut()") //applying pointcut on before advice  
	    public void myadvice1(JoinPoint jp)//it is advice (before advice)  
	    {  
	        System.out.println("additional concern");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	    }  
	    
	    @After("afterpointcut()")
	    public void myadvice2(JoinPoint jp)//it is advice (before advice)  
	    {  
	        System.out.println("done with getter method");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	    }  
	    
	    @Around("aroundpointcut()")  
	    public Object myadvice3(ProceedingJoinPoint pjp) throws Throwable   
	    {  
	        System.out.println("Additional Concern Before calling actual method");  
	        Object obj=pjp.proceed();  
	        System.out.println("Additional Concern After calling actual method");  
	        return obj;  
	    }  
}
