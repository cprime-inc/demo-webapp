package irkd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUserAccount {
  
	@Test (groups = {"account", "smoke-tests"})
	public void rejectAccountNoUsername() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "integration-tests"})
	public void rejectAccountInvalidUsername() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "smoke-tests"})
	public void createAccount() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"account", "integration-tests"})
	public void createAccountHyphenatedLastName() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	
}
