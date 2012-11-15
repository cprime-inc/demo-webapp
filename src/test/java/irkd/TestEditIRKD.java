package irkd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEditIRKD {
	
	
	@Test (groups = {"issue", "smoke-tests"})
	public void rejectEditRemoveSummary() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration-tests"})
	public void rejectEditRemoveDescription() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "smoke-tests"})
	public void acceptEditNewSummary() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration-tests"})
	public void acceptEditNewDescription() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "ui", "ui-smoke"})
	public void rejectEditRemoveDescriptionUI() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "ui", "ui-smoke"})
	public void acceptEditNewSummaryUI() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(false);
	}
	
	
}
