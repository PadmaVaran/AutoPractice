package com.pages.AutoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AutoPractice.AutoConstant;

public class POMAutoPracticeSearchPage implements AutoConstant
{
	@FindBy(xpath="//input[@name='search_query']")
	private WebElement searchBtn;

	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement submitBtn;

	public POMAutoPracticeSearchPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

	public void searchProduct()
	{
	  searchBtn.sendKeys("Faded Short Sleeve T-shirts");
	  submitBtn.click();
	}
}
