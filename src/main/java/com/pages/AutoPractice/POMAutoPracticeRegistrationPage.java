package com.pages.AutoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AutoPractice.AutoConstant;

public class POMAutoPracticeRegistrationPage implements AutoConstant
{
	@FindBy(linkText="Sign in")
	private WebElement signinLink;

	@FindBy(id="email_create")
	private WebElement emailAddressField;

	@FindBy(xpath="//button[@name='SubmitCreate']")
	private WebElement createAccountBtn;

	@FindBy(id="id_gender2")
	private WebElement titleBtn;

	@FindBy(name="customer_firstname")
	private WebElement firtnameField;

	@FindBy(name="customer_lastname")
	private WebElement lastnameField;

	@FindBy(name="passwd")
	private WebElement passwordField;

	@FindBy(name="firstname")
	private WebElement firtnameBtn;

	@FindBy(name="lastname")
	private WebElement lastnameBtn;

	@FindBy(name="address1")
	private WebElement addressBtn;

	@FindBy(name="city")
	private WebElement cityBtn;

	@FindBy(name="id_state")
	private WebElement stateDrpDown;
	
	@FindBy(name="postcode")
	private WebElement zipBtn;

	@FindBy(name="id_country")
	private WebElement countryDrpDown;

	@FindBy(name="phone_mobile")
	private WebElement mobilephoneBtn;

	@FindBy(name="alias")
	private WebElement aliasaddressBtn;

	@FindBy(name="submitAccount")
	private WebElement submitBtn;


	public POMAutoPracticeRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void submitDetails()
	{
		signinLink.click();
		emailAddressField.sendKeys("z5999@gmail.com");
		createAccountBtn.click();
		titleBtn.click();
		firtnameField.sendKeys("Maggie");
		lastnameField.sendKeys("Davis");
		passwordField.sendKeys("abc12");
		firtnameBtn.sendKeys("Maggie");
		lastnameBtn.sendKeys("Davis");
		addressBtn.sendKeys("1 Main Street");
		cityBtn.sendKeys("Greenville");
		stateDrpDown.sendKeys("South Carolina");
		zipBtn.sendKeys("29201");
		//selectByVisibleText(countryDrpDown, "United States");
		mobilephoneBtn.sendKeys("8031112222");
		aliasaddressBtn.sendKeys("15Polo Rd Columbia SC");
		submitBtn.click();

	}

	/*private void selectByIndex(WebElement stateDrpDown, String string)
	{
		selectByIndex(stateDrpDown, "2");
		
	}*/
	
	
	/*private void selectByVisibleText(WebElement countryDrpDown, String string)
	{
		selectByVisibleText(countryDrpDown, "United States");
		
	}*/
}
