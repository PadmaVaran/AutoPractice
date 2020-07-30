package com.pages.AutoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMAutoPracticeWishListPage
{
	@FindBy(linkText="Women")
	private WebElement womenBtn;

	@FindBy(linkText="Tops")
	private WebElement topsBtn;

	@FindBy(linkText="T-shirts")
	private WebElement tshirtsBtn;

	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement secondimgBtn;

	@FindBy(xpath="//div[@class='right-block']//span[.='More']")
	private WebElement moreBtn;

	@FindBy(id="wishlist_button")
	private WebElement wishlistBtn;

	public POMAutoPracticeWishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void wishList()
	{
		womenBtn.click();
		topsBtn.click();
		tshirtsBtn.click();
		secondimgBtn.click();
		moreBtn.click();
		wishlistBtn.click();

	}
}
