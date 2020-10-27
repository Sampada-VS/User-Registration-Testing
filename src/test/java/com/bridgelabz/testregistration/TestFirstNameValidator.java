package com.bridgelabz.testregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFirstNameValidator {
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
	public void givenFirstName_WhenProper_thenAssertionHappy() {
		assertTrue(validator.validateFirstName("Sampada"));
	}
	@Test
	public void givenFirstName_WhenLessThan3Letters_thenAssertionSad() {
		assertFalse(validator.validateFirstName("Sa"));
	}
	@Test
	public void givenFirstName_WhenNotStartWithUppercase_thenAssertionSad() {
		assertFalse(validator.validateFirstName("sam"));
	}

}
