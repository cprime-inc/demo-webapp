package irkd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateIRKD {
	
	
	@Test (groups = {"issue", "smoke-tests"})
	public void rejectIRKDNoSummary() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration-tests"})
	public void rejectIRKDNoDescription() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration-tests"})
	public void createIRKDAllFieldsPopulated() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration-tests"})
	public void createIRKDOnlyRequiredFeilds() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "ui"})
	public void createIRKDOnlyRequiredFeildsUI() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
}
