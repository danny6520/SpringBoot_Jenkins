package com.springbootfirstapp;

import org.springframework.stereotype.Component;

@Component
public class Componentaddtwo {

	public String selectdbvalues(String num1, String num2) {
		return "I am the result from Component done logic" + num1 + num2;
	}
}
