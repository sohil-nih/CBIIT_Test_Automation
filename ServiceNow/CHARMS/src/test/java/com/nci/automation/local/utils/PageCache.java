package com.nci.automation.local.utils;

import com.nci.charms.automation.pages.CharmsHomePage;
import com.nci.charms.automation.pages.ITrustLoginPage;
import com.nci.charms.automation.pages.NativeViewDashboardPage;
import com.nci.charms.automation.steps.impl.CharmsHomePageImpl;
import com.nci.charms.automation.steps.impl.ITrustLoginPageImpl;
import com.nci.charms.automation.steps.impl.NativeViewDashboardPageImpl;


public class PageCache {

	private static ThreadLocal<PageCache> pageCache = new ThreadLocal<PageCache>();

	private PageCache() {
		// Private Constructor
	}

	public synchronized static PageCache getInstance() {
		if (pageCache.get() == null) {
			pageCache.set(new PageCache());
		}
		return pageCache.get();
	}

	// private pages variables
	private ITrustLoginPageImpl iTrustLoginImpl;
	private CharmsHomePageImpl charmsHomePageImpl;
	private NativeViewDashboardPageImpl nativeViewDashImpl;

	// private Pages variable if any
	private CharmsHomePage covidHomePage;
	private ITrustLoginPage iTrustLoginPage;
	private NativeViewDashboardPage nativeViewDashPage;

	// add implementation class object bellow
	public ITrustLoginPageImpl getITrustLoginPageImpl() {
		if (iTrustLoginImpl == null)
			iTrustLoginImpl = new ITrustLoginPageImpl();
		return iTrustLoginImpl;
	}

	public CharmsHomePageImpl getCOVIDHomePageImpl() {
		if (charmsHomePageImpl == null)
			charmsHomePageImpl = new CharmsHomePageImpl();
		return charmsHomePageImpl;
	}


	public NativeViewDashboardPageImpl getNativeViewDashboardPageImpl() {
		if (nativeViewDashImpl == null)
			nativeViewDashImpl = new NativeViewDashboardPageImpl();
		return nativeViewDashImpl;
	}

	// Pages Object below
	public ITrustLoginPage getITrustLoginPage() {
		if (iTrustLoginPage == null)
			iTrustLoginPage = new ITrustLoginPage();
		return iTrustLoginPage;
	}

	public CharmsHomePage getCOVIDHomePage() {
		if (covidHomePage == null)
			covidHomePage = new CharmsHomePage();
		return covidHomePage;
	}

	public NativeViewDashboardPage getNativeViewDashboardPage() {
		if (nativeViewDashPage == null)
			nativeViewDashPage = new NativeViewDashboardPage();
		return nativeViewDashPage;
	}



	
	

	
	/**
	 * This method will destroy any object that was created.
	 */
	public void destroyInstances() {
		
		if (iTrustLoginImpl != null)
			iTrustLoginImpl = null;

		if (charmsHomePageImpl != null)
			charmsHomePageImpl = null;

		if (nativeViewDashImpl != null)
			nativeViewDashImpl = null;

		if (covidHomePage != null)
			covidHomePage = null;

		if (iTrustLoginPage != null)
			iTrustLoginPage = null;

		if (nativeViewDashPage != null)
			nativeViewDashPage = null;

	}
}
