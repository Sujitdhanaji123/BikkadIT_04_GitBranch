package com.BikkadIT.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class GreetController {

	@GetMapping("/greet")
	public String greet() {
		String msg="Good Morning India";
		return msg;
	}
}

