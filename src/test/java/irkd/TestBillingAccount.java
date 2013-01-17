package irkd;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TestBillingAccount {

  @BeforeMethod (alwaysRun=true)
  public void beforeMethod() {
	  //simulate skipped tests for TestNG reporting
	  Assert.assertTrue(false);
  }
  
 @Test(groups = "unit")
  public void testCreateBillingAccount(){
		// ///////////////
		// your actual test would go here
		// ///////////////

		Assert.assertTrue(true);
  }
  
  @Test(groups = "unit")
  public void testCreateBillingAccountRequiredFields(){
		// ///////////////
		// your actual test would go here
		// ///////////////

		Assert.assertTrue(true);
  }
  
  @Test(groups = "account")
  public void rejectCreateBillingAccountInvalidAddress(){
		// ///////////////
		// your actual test would go here
		// ///////////////

		Assert.assertTrue(true);
  }

}
