package irkd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEditIRKD {
	
	
	@Test (groups = {"issue", "unit"})
	public void testRemoveSummary() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "unit"})
	public void testRemoveDescription() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "smoke_tests"})
	public void rejectEditRemoveSummary() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration_tests"})
	public void rejectEditRemoveDescription() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "smoke_tests"})
	public void acceptEditNewSummary() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration_tests"})
	public void acceptEditNewDescription() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "ui", "ui_smoke"})
	public void rejectEditRemoveDescriptionUI() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "ui", "ui_smoke"})
	public void acceptEditNewSummaryUI() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(false);
	}
	
	
}
