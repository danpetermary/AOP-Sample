package com.stackroute.myrest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggerAspect {

	
	private static final Logger logger=LoggerFactory.getLogger(LoggerAspect.class);

	@Before ("demo()")
	public void myfirst(JoinPoint jp)
	{
		logger.info("CGI AUGUST BATCH - DEMO REST - STARTED");
	}
	
	@After ("execution (* com.stackroute.myrest.controller.MyController.*(..))")
	public void mysecond(JoinPoint jp)
	{
		logger.info("CGI BATCH - DEMO ON controfller is over");
	}
	
	@AfterReturning("demo()")
	   public void afterreturn(JoinPoint join)
	   {
	   logger.info("i am afer demo over");
	   }
	   
	   
	   @AfterThrowing("demo()")
	   public void aftererror(JoinPoint join)
	   {
	   
	   }

	
	   @Around("demo()")
	   public Object demoaround(ProceedingJoinPoint prod)
	   {
	   System.out.println("berofe DEMO AROUND checking,,,,,,");
	   Object val=null;
	   try
	   {
	   val=prod.proceed();
	   }
	   catch(Throwable e)
	   {
	   System.out.println("Some exception inside firstfun method");
	   }
	   System.out.print(":after");
	   return val;
	   }

	   
	   
	   
	   
	@Pointcut("execution (* com.stackroute.myrest.controller.MyController.firstfun(..))")
	public void demo()
	{
		
	}
}
