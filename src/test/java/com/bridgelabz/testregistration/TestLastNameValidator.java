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
	public void givenLastName_WhenProper_thenAssertionHappy() {
		assertTrue(validator.validateLastName("Shivkar"));
	}
	@Test
	public void givenLastName_WhenLessThan3Letters_thenAssertionSad() {
		assertFalse(validator.validateLastName("Sh"));
	}
	@Test
	public void givenLastName_WhenNotStartWithUppercase_thenAssertionSad() {
		assertFalse(validator.validateLastName("shivkar"));
	}

}
