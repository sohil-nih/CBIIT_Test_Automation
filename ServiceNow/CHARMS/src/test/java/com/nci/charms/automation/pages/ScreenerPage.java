package com.nci.charms.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;


public class ScreenerPage extends CommonUtils {

	// add xpaths
	@FindBy(xpath = "//p[@ng-bind-html='options.message']")
	private WebElement warningVerbageText;
	
	@FindBy(xpath = "//button[text()='Agree']")
	private WebElement agreeButton;
	
	@FindBy(xpath = "//img[@src='FCSMS-HomePage-Intake.jpg']")
	private WebElement screenerMainForm;
	
	//Study Introduction Elements 
	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	private WebElement areYouFillingQForSomeoneElseDD;
	
	@FindBy(xpath = "//button[@ng-click='saveNext(c.forms.LFS1)']")
	private WebElement SaveAndNextButton;
	
	//Demographic Information Elements
	@FindBy(xpath = "//input[@id='sp_formfield_name']")
	private WebElement researchParticipantsName;
	
	@FindBy(xpath = "//span[@id='select2-chosen-9']")
	private WebElement biologicalSexField;
	
	@FindBy(xpath = "//input[@id='sp_formfield_birthday']")
	private WebElement dateOfBirthField;
	
	@FindBy(xpath = "//span[@id='select2-chosen-10']")
	private WebElement countryOfBirth;
	
	@FindBy(xpath = "//input[@id='sp_formfield_birth_city']")
	private WebElement birthCity;
	
	@FindBy(xpath = "//input[@id='sp_formfield_birth_state']")
	private WebElement birthState;
	
	@FindBy(xpath = "//span[@id='select2-chosen-11']")
	private WebElement ethnicity;
	
	@FindBy(xpath = "//input[@id='s2id_autogen14']")
	private WebElement race;
	
	
	
	
	// initialize all variables
	public ScreenerPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	

}
