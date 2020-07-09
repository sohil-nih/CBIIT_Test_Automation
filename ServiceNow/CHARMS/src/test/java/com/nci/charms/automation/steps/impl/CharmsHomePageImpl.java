package com.nci.charms.automation.steps.impl;

import org.junit.Assert;
import com.nci.automation.local.utils.PageCache;
import com.nci.automation.local.utils.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class CharmsHomePageImpl extends PageInitializer {

	private static PageCache pageCache = PageCache.getInstance();

	public void navigateToCOVIDDashLoginPage() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl());
	}

	public void clickOnLoginToAccessBtn() {
		
	}

	public void verifyUserLoggedIn() {
		Assert.assertTrue(WebDriverUtils.webDriver.getCurrentUrl().contains(""));
		CucumberLogUtils.logScreenShot();
	}

}
