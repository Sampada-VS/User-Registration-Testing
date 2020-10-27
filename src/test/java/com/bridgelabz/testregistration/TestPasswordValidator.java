package com.bridgelabz.testregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPasswordValidator {

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
	public void givenPassword_WhenProper_thenAssertionHappy() {
		assertTrue(validator.validatePassword("hjh@623Thj"));
	}
	@Test
	public void givenPassword_WhenLessThan8Char_thenAssertionSad() {
		assertFalse(validator.validatePassword("@623Thj"));
	}
	@Test
	public void givenPassword_WhenNoUpperCaseLetter_thenAssertionSad() {
		assertFalse(validator.validatePassword("hjh@623hf"));
	}
	@Test
	public void givenPassword_WhenNoNumericNumber_thenAssertionSad() {
		assertFalse(validator.validatePassword("hjh@gfgjThj"));
	}
	@Test
	public void givenPassword_WhenNoSpecialCharacter_thenAssertionSad() {
		assertFalse(validator.validatePassword("hjhgfgjThj"));
	}
	@Test
	public void givenPassword_WhenMoreThan1SpecialChar_thenAssertionSad() {
		assertFalse(validator.validatePassword("hjh@gfg#jThj"));
	}
}
