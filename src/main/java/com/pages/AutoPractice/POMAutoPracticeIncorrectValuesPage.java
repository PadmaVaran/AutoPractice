package com.pages.AutoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AutoPractice.AutoConstant;

public class POMAutoPracticeIncorrectValuesPage implements AutoConstant
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


	public POMAutoPracticeIncorrectValuesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void incorrectValues()
	{
		signinLink.click();
		emailAddressField.sendKeys("z1999@gmail.com");
		createAccountBtn.click();
		titleBtn.click();
		firtnameField.sendKeys("12");
		lastnameField.sendKeys("Davis");
		passwordField.sendKeys("abc12");
		firtnameBtn.sendKeys("Maggie");
		lastnameBtn.sendKeys("Davis");
		addressBtn.sendKeys("1 Main Street");
		cityBtn.sendKeys("Greenville");
		stateDrpDown.sendKeys("South Carolina");
		zipBtn.sendKeys("29201");
		countryDrpDown.sendKeys("United States");
		mobilephoneBtn.sendKeys("8031112222");
		aliasaddressBtn.sendKeys("15Polo Rd Columbia SC");
		submitBtn.click();

	}

	
}


