package com.bridgelabz.testregistration;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestEmailIdValidator {
	private String emailId;
	private boolean result;
	private UserValidator validator;
	
	@Before
	public void initialize() {
		validator = new UserValidator();
	}
	
	public TestEmailIdValidator(String emailId,boolean result) {
		this .emailId=emailId;
		this.result=result;
	}
	
	@Test
	public void testEmailId() {
		try {
			assertEquals(result,validator.validateEmailId(emailId));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
	@Parameters
	public static Collection<Object[]> emailIds() {
		return Arrays.asList(
			new Object[][] { {"abc@yahoo.com", true},
							 {"abc-100@yahoo.com", true},
							 {"abc.100@yahoo.com", true},
							 {"abc111@abc.com", true},
							 {"abc-100@abc.net", true},
							 {"abc.100@abc.com.au", true},
							 {"abc@1.com", true},
							 {"abc+100@gmail.com", true},
							 {"abc", false},
							 {"abc@gmail.com.com", false},
							 {"abc@.com.my", false},
							 {"abc123@gmail.a", false},
							 {"abc123@.com", false},
							 {"abc123@.com.com", false},
							 {".abc@abc.com", false},
							 {"abc()*@gmail.com", false},
							 {"abc@%*.com", false},
							 {"abc..2002@gmail.com", false},
							 {"abc.@gmail.com", false},
							 {"abc@abc@gmail.com", false},
							 {"abc@gmail.com.1a", false},
							 {"abc@gmail.com.aa.au", false},
				});
	}

}
