package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcomeontroller
{
	@GetMapping("/welcome")
public String welcomecontroller()

{
	String mgs ="Welcome To BikkkadIT";
	return mgs;
	
}
}
