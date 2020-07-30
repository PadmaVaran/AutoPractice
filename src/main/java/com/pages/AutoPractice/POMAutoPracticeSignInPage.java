package com.pages.AutoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AutoPractice.AutoConstant;

public class POMAutoPracticeSignInPage implements AutoConstant
{
	@FindBy(linkText="Sign in")
	private WebElement signinLink;

	@FindBy(name="email")
	private WebElement emailField;

	@FindBy(name="passwd")
	private WebElement pwdField;

	@FindBy(name="SubmitLogin")
	private WebElement submitBtn;

	public POMAutoPracticeSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void login()
	{
		signinLink.click();
		emailField.sendKeys("ghj12@gmail.com");
		pwdField.sendKeys("abc12");
		submitBtn.click();
	}
}
