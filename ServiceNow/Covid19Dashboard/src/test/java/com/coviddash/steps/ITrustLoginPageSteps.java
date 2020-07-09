package com.coviddash.steps;

import com.coviddah.local.utils.PageCache;
import com.coviddah.local.utils.PageInitializer;
import com.nci.automation.xceptions.TestingException;
import cucumber.api.java.en.When;


public class ITrustLoginPageSteps extends PageInitializer {
	
	private static PageCache pageCache=PageCache.getInstance();
	
	
	@When("logs in by entering iTrust credentials")
	public void logs_in_by_entering_iTrust_credentials() throws TestingException {
		pageCache.getITrustLoginPageImpl().loginToITrust();
	}

}
