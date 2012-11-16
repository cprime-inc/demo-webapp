package irkd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUserAccount {
  
	@Test (groups = {"account", "unit"})
	public void testNoUsername() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "unit"})
	public void testInvalidUsername() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "unit"})
	public void testCreateAccount() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "unit"})
	public void rejectAccountMismatchedPassword() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "smoke_tests"})
	public void rejectAccountNoUsername() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "integration_tests"})
	public void rejectAccountInvalidUsername() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "smoke_tests"})
	public void createAccount() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "integration_tests"})
	public void createAccountHyphenatedLastName() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"ui", "ui_smoke"})
	public void rejectAccountInvalidUsernameUI() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"ui"})
	public void createAccountUI() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	
}
