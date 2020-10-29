package com.bridgelabz.testregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLastNameValidator {

	static UserValidator validator;
	@BeforeClass
	public static void createObj() {
		validator = new UserValidator();
	}
	@AfterClass
	public static void nullObj() {
		validator = null;
	}
	@Test
	public void givenLastName_WhenProper_thenAssertionHappy() throws UserValidatorException  {
		assertTrue(validator.validateLastName("Shivkar"));
	}
	@Test
	public void givenLastName_WhenLessThan3Letters_thenAssertionSad() {
		try {
			assertFalse(validator.validateLastName("Sh"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}

	}
	@Test
	public void givenLastName_WhenNotStartWithUppercase_thenAssertionSad() {
		try {
			assertFalse(validator.validateLastName("shivkar"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}

}
