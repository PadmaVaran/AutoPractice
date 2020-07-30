package com.pages.AutoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AutoPractice.AutoConstant;

public class POMAutoPracticeInvalidEmailPage implements AutoConstant
{
	@FindBy(linkText="Sign in")
	private WebElement signinLink;

	@FindBy(name="email")
	private WebElement emailField;

	@FindBy(name="SubmitLogin")
	private WebElement submitBtn;

	public POMAutoPracticeInvalidEmailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void invalidLEmail()
	{
		signinLink.click();
		emailField.sendKeys("a23");
		submitBtn.click();
	}
}
