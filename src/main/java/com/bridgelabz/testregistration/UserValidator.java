package com.bridgelabz.testregistration;

import java.util.regex.Pattern;

public class UserValidator {
	
	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";

	public boolean validateFirstName(String firstName) {
		return Pattern.compile(NAME_PATTERN).matcher(firstName).matches();	
	}
	public boolean validateLastName(String lastName) {
		return Pattern.compile(NAME_PATTERN).matcher(lastName).matches();	
	}

}
