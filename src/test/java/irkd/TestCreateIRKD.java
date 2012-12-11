package irkd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateIRKD {
	
	
	@Test (groups = {"issue", "unit"})
	public void testNoSummary() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}

	@Test (groups = {"issue", "unit"})
        public void testNoAssignee() throws Exception {
                /////////////////
                // your actual test would go here
                /////////////////

                Assert.assertTrue(true);
        }
	
	@Test (groups = {"issue", "unit"})
	public void testNoDescription() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}

 	 @Test (groups = {"issue", "unit"})
        public void testNoFixVersion() throws Exception {
                /////////////////
                // your actual test would go here
                /////////////////

                Assert.assertTrue(true);
        }
	
	@Test (groups = {"issue", "smoke_tests"})
	public void rejectIRKDNoSummary() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration_tests"})
	public void rejectIRKDNoDescription() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(false);
	}
	
	@Test (groups = {"issue", "integration_tests"})
	public void createIRKDAllFieldsPopulated() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"issue", "integration_tests"})
	public void createIRKDOnlyRequiredFeilds() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"ui"})
	public void createIRKDOnlyRequiredFeildsUI() throws Exception {
		/////////////////
		// your actual test would go here
		/////////////////
		
		Assert.assertTrue(true);
	}
}
