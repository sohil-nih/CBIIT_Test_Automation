package com.nci.charms.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;


public class CharmsHomePage extends CommonUtils {

	// add xpaths
	@FindBy(xpath = "//button[@class='login-btn']")
	private WebElement charmsLoginBtn;

	@FindBy(xpath = "//input[@id='idp-discovery-username']")
	private WebElement oktaUserNameField;
	
	@FindBy(xpath = "//input[@id='input5']")
	private WebElement rememberMeCheckbox;
	
	@FindBy(xpath = "//input[@value='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//input[@id='okta-signin-password']")
	private WebElement oktaPasswordField;
	
	@FindBy(xpath = "//input[@id='okta-signin-submit']")
	private WebElement oktaSignInButton;
	
	//Register elements
	@FindBy(xpath = "//a[text()=' Register ']")
	private WebElement registerLink;
	
	@FindBy(xpath = "//input[@id='signup_firstname']")
	private WebElement signUpFirstNameField;

	@FindBy(xpath = "//input[@id='signup_lastname']")
	private WebElement signUpLastNameField;
	
	@FindBy(xpath = "//input[@id='signup_email']")
	private WebElement signUpEmailField;
	
	@FindBy(xpath = "//input[@id='signup_lastname']")
	private WebElement signUpConfirmEmailField;
	
	@FindBy(xpath = "//input[@id='signup_phone']")
	private WebElement signUpPhoneField;
	
	@FindBy(xpath = "//input[@ng-click='c.checkAge()']")
	private WebElement areYouOver18checkBox;
	
	@FindBy(xpath = "//button[@ng-show='!c.enableSignup']")
	private WebElement createAccountButton;
	
	@FindBy(xpath = "//h2[text()=' Thank you for registering! ']")
	private WebElement thankYouForRegisteringText;
	
	@FindBy(xpath = "//a[text()='Enroll here!']")
	private WebElement enrollHere;
	
	
	
	// initialize all variables
	public CharmsHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	

}
