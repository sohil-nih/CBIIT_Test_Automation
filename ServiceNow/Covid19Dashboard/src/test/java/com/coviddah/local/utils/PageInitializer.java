package com.coviddah.local.utils;

import com.coviddash.pages.COVIDHomePage;
import com.coviddash.pages.ITrustLoginPage;
import com.coviddash.pages.NativeViewDashboardPage;
import com.coviddash.pages.SubmissionsPage;
import com.coviddash.steps.impl.ITrustLoginPageImpl;

/**
 * This an initializer class which will initialize all pages classes.
 * Once pages class created, create an object it here inside the constructor
 */
public class PageInitializer { 

	// declare protected static variables of types of all the pages
	protected static ITrustLoginPage iTrustloginPage;
	protected static ITrustLoginPageImpl loginImpl;
	protected static COVIDHomePage covidHomePage;
	protected static SubmissionsPage submissionPage;
	protected static NativeViewDashboardPage nativeViewDashPage;
	
	
	public static void initializeAllPages() {
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		 loginImpl=new ITrustLoginPageImpl();
		 covidHomePage = new COVIDHomePage();
		 submissionPage=new SubmissionsPage();
		 nativeViewDashPage=new NativeViewDashboardPage();
	}
	
	
	
}
