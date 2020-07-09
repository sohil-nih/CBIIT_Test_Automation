package com.nci.charms.automation.steps.impl;

import com.nci.automation.local.utils.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

public class ITrustLoginPageImpl extends PageInitializer{
	
	
	public void loginToITrust() throws TestingException {
		MiscUtils.sleep(2000);
		iTrustlogin.enterUsername();
		iTrustlogin.enterPassword();
		CucumberLogUtils.logScreenShot();
		iTrustlogin.clickSignInButton();
	}
	

}
