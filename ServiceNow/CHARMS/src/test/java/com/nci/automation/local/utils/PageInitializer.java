package com.nci.automation.local.utils;

import com.nci.charms.automation.pages.CharmsHomePage;
import com.nci.charms.automation.pages.ITrustLoginPage;
import com.nci.charms.automation.pages.NativeViewDashboardPage;
import com.nci.charms.automation.steps.impl.ITrustLoginPageImpl;

/**
 * This an initializer class which will initialize all pages classes.
 * Once pages class created, create an object it here inside the constructor
 */
public class PageInitializer { 

	// declare protected static variables of types of all the pages
	protected static ITrustLoginPage iTrustlogin;
	protected static ITrustLoginPageImpl iTrustLoginImpl;
	protected static CharmsHomePage charmsHomePage;
	protected static NativeViewDashboardPage nativeViewDashPage;
	
	
	public static void initializeAllPages() {
		// create instances of all pages and assign them to the variables
		iTrustlogin = new ITrustLoginPage();
		iTrustLoginImpl=new ITrustLoginPageImpl();
		charmsHomePage = new CharmsHomePage();
		 nativeViewDashPage=new NativeViewDashboardPage();
	}
	
	
	
}
