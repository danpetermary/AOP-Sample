package com.stackroute.myrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/myapp/home")
	public ResponseEntity<?> firstfun()
	{
	return new ResponseEntity<String>("Welcome",HttpStatus.OK);	
	}
	
	@GetMapping("/myapp/{uname}")
	public ResponseEntity<?> secondfun(@PathVariable("uname") String un)
	{
	 	String myoutput="Hai " + un;
	 if(un=="Sam")
	 return new ResponseEntity<String>(myoutput,HttpStatus.ACCEPTED);
	 else
		 return new ResponseEntity<String>("Invaid user",HttpStatus.UNAUTHORIZED);
	}
	
}
