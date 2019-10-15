package com.stackroute.myrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.stackroute.myrest.aspect.LoggerAspect;

 

@Configuration
@EnableWebMvc
@ComponentScan("com.stackroute.myrest")
@EnableAspectJAutoProxy

public class ApplicationContextIntitalizer {

	@Bean(name="logAspect")
	public LoggerAspect loggingasp()
	{
	return new LoggerAspect();  
	}

	
	
}
