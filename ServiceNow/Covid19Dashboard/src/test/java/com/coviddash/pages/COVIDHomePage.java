package com.coviddash.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coviddah.local.utils.COVIDConstants;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;


public class COVIDHomePage extends CommonUtils {

	// add xpaths
	@FindBy(xpath = "//button[@ng-click='c.login()']")
	private WebElement iTrustRedirectForLogin;

	@FindBy(xpath = "//span[contains(@class,'user-name')]")
	private WebElement covidHomeLogoutDD;

	@FindBy(xpath = "//a[@ng-click='logout();']")
	private WebElement covidHomeLogoutLink;

	@FindBy(xpath = "//span[@class='select2-arrow']")
	private WebElement principalInvestigatorDD;

	@FindBy(xpath = "//input[@id='s2id_autogen2_search']")
	private WebElement pISearchBox;

	@FindBy(xpath = "//ul[@id='select2-results-2']/li/div")
	private List<WebElement> ddValues;

	@FindBy(xpath = "//input[@id='institution']")
	private WebElement instituteField;

	@FindBy(xpath = "//input[@id='division']")
	private WebElement divisionField;

	@FindBy(xpath = "//input[@id='piEmail']")
	private WebElement emailAddressField;

	@FindBy(xpath = "//input[@id='piPhone']")
	private WebElement phonNumberField;

	@FindBy(xpath = "//input[@id='irb-protocol']")
	private WebElement ibrProtocolField;

	@FindBy(xpath = "//input[@id='study-title']")
	private WebElement studyTileField;

	@FindBy(xpath = "//button[contains(@class,'multiselect')]")
	private WebElement biospaecimenTypeDd;

	@FindBy(xpath = "//ul[contains(@class,'multiselect')]//label")
	private List<WebElement> biospaecimenTypeDdValues;

	@FindBy(xpath = "//input[@id='other-biospecimen-type']")
	private WebElement otherBiospecimentType;

	@FindBy(xpath = "//select[@id='collection-frequency']")
	private WebElement collectionFrequencyDd;

	@FindBy(xpath = "//select[@id='repository-location']")
	private WebElement repositoryLocationDd;

	@FindBy(xpath = "//textarea[@id='specific-aims']")
	private WebElement studySpecificAims;

	@FindBy(xpath = "//input[@id='attachment-input']")
	private WebElement attachmentButton;

	@FindBy(xpath = "//a[@class='url-btn']")
	private WebElement urlButton;

	@FindBy(xpath = "//input[@id='url-input']")
	private WebElement urlField;

	@FindBy(xpath = "//a[@name='add']")
	private WebElement urlAddButton;

	@FindBy(xpath = "//i[@ng-click='c.removeUrl(url);']")
	private List<WebElement> urlDeleteButton;

	@FindBy(xpath = "//button[@ng-click='c.addNewUrl();']")
	private WebElement urlSaveButton;

	@FindBy(xpath = "//h4[text()='Related URL(s)']/following::a[1]")
	private WebElement addedUrlLink;

	@FindBy(xpath = "//button[@ng-click='c.confirmSubmission();']")
	private WebElement submitButton;

	@FindBy(xpath = "//button[text()='Confirm and Submit']")
	private WebElement confirmSubmitButton;

	@FindBy(xpath = "//div[@class='uploaded-files']/div/p")
	private WebElement uploadedFile;

	@FindBy(xpath = "//*[@id='error-modal']/div/div/div[3]/button")
	private WebElement goBackButton;

	@FindBy(xpath = "//*[text()=' Study documentation is required. Please attach the appropriate file(s). ']")
	private WebElement studyDocumentationErrorMessage;

	@FindBy(xpath = "//p[@class='text-content']")
	private WebElement homePageVerbiage;

	@FindBy(xpath = "//*[text()=' Please enter an IRB protocol number. This field is required. ']")
	private WebElement irbProtocolNumberErrormsg;

	@FindBy(xpath = "//*[text()=' Please enter a title for this study. This field is required. ']")
	private WebElement studyTitleErrorMsg;

	@FindBy(xpath = "//*[text()=' Please select the appropriate collection frequency. This field is required. ']")
	private WebElement biospecimenCollFreqErrorMessage;

	@FindBy(xpath = "//p[text()=' Please enter the study specific aims. This field is required. ']")
	private WebElement studySpecificAimsErrorMessage;

	// initialize all variables
	public COVIDHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/**
	 * This method will direct you to ITrust and login and redirect to covid19
	 * dashboard page
	 */
	public void clickITrustRedirectButton() {
		iTrustRedirectForLogin.click();
	}

	public void searchPrincipalInvestigator(String investgatorName) {
		principalInvestigatorDD.click();
		pISearchBox.sendKeys(investgatorName);
		MiscUtils.sleep(500);
		pISearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
	}

	public WebElement instituteField() {
		return instituteField;
	}

	public WebElement divisionField() {
		return divisionField;
	}

	public WebElement emailAddressField() {
		return emailAddressField;
	}

	public WebElement phonNumberField() {
		return phonNumberField;
	}

	public WebElement submitButton() {
		return submitButton;
	}

	public WebElement urlButton() {
		return urlButton;
	}

	public WebElement urlField() {
		return urlField;
	}

	public WebElement goBackButton() {
		return goBackButton;
	}

	public String getHomePageVerbiageText() {
		return homePageVerbiage.getText();
	}

	public WebElement studyDocumentationErrorMessage() {
		return studyDocumentationErrorMessage;
	}

	public WebElement irbProtocolNumberErrormsg() {
		return irbProtocolNumberErrormsg;
	}

	public WebElement studyTitleErrorMsg() {
		return studyTitleErrorMsg;
	}

	public WebElement biospecimenCollFreqErrorMessage() {
		return biospecimenCollFreqErrorMessage;
	}

	public WebElement ibrProtocolField() {
		return ibrProtocolField;
	}

	public WebElement studySpecificAims() {
		return studySpecificAims;
	}

	public WebElement studySpecificAimsErrorMessage() {
		return studySpecificAimsErrorMessage;
	}

	public WebElement urlSaveButton() {
		return urlSaveButton;
	}

	public WebElement addedUrlLink() {
		return addedUrlLink;
	}

	public void enterIBRProtocolNumber(String ibrNumber) {
		ibrProtocolField.sendKeys(ibrNumber);
	}

	public WebElement studyTileField() {
		return studyTileField;
	}

	public void enterStudyTitle(String studyTitle) {
		studyTileField.sendKeys(studyTitle);
	}

	public List<WebElement> biospaecimenTypeDdValues() {
		return biospaecimenTypeDdValues;
	}

	public WebElement urlAddButton() {
		return urlAddButton;
	}

	public void enterOtherBiospecimentType(String otherTypeValue) {
		otherBiospecimentType.sendKeys(otherTypeValue);
	}

	public void clickBiospaecimenTypeDdDD() {
		JavascriptUtils.clickByJS(biospaecimenTypeDd);
	}

	public void selectCollectionFrequency() {
		JavascriptUtils.clickByJS(collectionFrequencyDd);
		CommonUtils.selectDropDownValue(collectionFrequencyDd, 1);
	}

	public void unsellectingCollectionFrequencyValue() {
		JavascriptUtils.clickByJS(collectionFrequencyDd);

	}

	public void verifiyRepositoryLocation(String repoLocation) {
		Assert.assertTrue(repositoryLocationDd.getText().contains(repoLocation));
	}

	public void enterStudySpecificAim(String aim) {
		studySpecificAims.sendKeys(aim);
	}

	public void attachStudyDocument() {
		MiscUtils.sleep(1500);
		attachmentButton.sendKeys(COVIDConstants.DOC_PATH);
		boolean isFileUploaded = uploadedFile.getText().contains(".docx");
		Assert.assertTrue(isFileUploaded);
	}

	public void attachURL() {
		JavascriptUtils.clickByJS(urlButton);
		MiscUtils.sleep(1000);
		urlField.sendKeys(COVIDConstants.TEST_URL);
		JavascriptUtils.clickByJS(urlAddButton);
		JavascriptUtils.clickByJS(urlSaveButton);
		boolean addedURL = addedUrlLink.getText().contains(COVIDConstants.TEST_URL);
		Assert.assertTrue(addedURL);
	}

	public void deleteURL() {
		MiscUtils.sleep(1000);
		urlDeleteButton.get(1).click();
		MiscUtils.sleep(2000);
	}

	public void clickSubmitAndConfirmSubButton() {
		JavascriptUtils.clickByJS(submitButton);
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(confirmSubmitButton);
	}

	public void logOutFromCovid() {
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(covidHomeLogoutDD);
		MiscUtils.sleep(500);
		JavascriptUtils.clickByJS(covidHomeLogoutLink);
	}

}
