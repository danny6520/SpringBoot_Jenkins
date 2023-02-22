package com.springbootfirstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeSpring {
@Autowired
ServiceAddTwo serviceaddtwo;

	@GetMapping("/welcome")
	public String welcome() {
		String s = serviceaddtwo.addtwo("a", "b");
		return s;
	}
}