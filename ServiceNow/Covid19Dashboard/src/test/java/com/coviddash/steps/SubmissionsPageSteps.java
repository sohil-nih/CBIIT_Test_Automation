package com.coviddash.steps;

import com.coviddah.local.utils.PageCache;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.xceptions.TestingException;
import cucumber.api.java.en.*;

public class SubmissionsPageSteps {

	private static PageCache pageCache = PageCache.getInstance();

	@Then("the Reviewer is directed to the Submissions page")
	public void the_Reviewer_is_directed_to_the_Submissions_page() throws TestingException {
		pageCache.getNativeViewDashboardPageImpl().impersonateUser("Sharon Savage");

	}

	@Then("is able to see two tables names {string} and {string}")
	public void is_able_to_see_two_tables_names_and(String pendingStudies, String rejectedStudies) {
		pageCache.getSubmissionsPageImpl().verifySubmissionsTablesExists(pendingStudies, rejectedStudies);
	}

	@Then("the submitted study is displayed and options to Approve or Reject are available")
	public void the_submitted_study_is_displayed_and_options_to_Approve_or_Reject_are_available() {
		pageCache.getSubmissionsPage().verifyApproveRejectButton();
		CucumberLogUtils.logScreenShot();

	}
}
