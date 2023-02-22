package com.springbootfirstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ServiceAddTwo {
//object@Autowired

	public String addtwo(String num1, String num2) {
		//return num1 + num2;
		Componentaddtwo c = new Componentaddtwo();
		String result = c.selectdbvalues(num1, num2);
		return result;
	}
	
}