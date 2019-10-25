package com.amdocs;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class Hello {
	
	public String sayHello() {
		return "Hello Microservice!";
	
	}

}
