package io.javabrains.springbootquickstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping("/hello")
	public String SayHi()
	{
		return "Hello this is a simple spring boot application!!!";
	}
}
