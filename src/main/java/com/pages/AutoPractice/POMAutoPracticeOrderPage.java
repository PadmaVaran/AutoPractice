package com.pages.AutoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AutoPractice.AutoConstant;

public class POMAutoPracticeOrderPage implements AutoConstant
{
	@FindBy(linkText="Sign in")
	private WebElement signinLink;

	@FindBy(name="email")
	private WebElement emailField;

	@FindBy(name="passwd")
	private WebElement pwdField;

	@FindBy(name="SubmitLogin")
	private WebElement submitBtn;

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

	@FindBy(xpath="//input[@name='qty']")
	private WebElement qtyBtn;

	@FindBy(xpath="//select[@name='group_1']")
	private WebElement sizeBtn;

	@FindBy(id="color_14")
	private WebElement colorBtn;

	@FindBy(xpath="//p[@id='add_to_cart']//span[.='Add to cart']")
	private WebElement addtocartBtn;

	@FindBy(xpath="//div[@class='button-container']//a[@title='Proceed to checkout']/span")
	private WebElement proceedtochkotBtn;

	@FindBy(xpath="//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']/span")
	private WebElement summarychkotBtn;

	@FindBy(xpath="//p[@class='cart_navigation clearfix']//button[@class='button btn btn-default button-medium']/span")
	private WebElement addresschkotBtn;

	@FindBy(id="cgv")
	private WebElement termsofservicecheckbox;

	@FindBy(xpath="//p[@class='cart_navigation clearfix']//button[@class='button btn btn-default standard-checkout button-medium']/span")
	private WebElement shippingchkotBtn;

	@FindBy(xpath="//p[@class='payment_module']//a[@class='cheque']")
	private WebElement paybycheckBtn;

	@FindBy(xpath="//p[@class='cart_navigation clearfix']//button[@class='button btn btn-default button-medium']/span[.='I confirm my order']")
	private WebElement confirmorderBtn;

	public POMAutoPracticeOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void orderSubmit()
	{
		signinLink.click();
		emailField.sendKeys("ghj12@gmail.com");
		pwdField.sendKeys("abc12");
		submitBtn.click();
		womenBtn.click();
		topsBtn.click();
		tshirtsBtn.click();
		secondimgBtn.click();
		moreBtn.click();
		qtyBtn.clear();
		qtyBtn.sendKeys("3");
		sizeBtn.sendKeys("M");
		colorBtn.click();
		addtocartBtn.click();
		proceedtochkotBtn.click();
		summarychkotBtn.click();
		addresschkotBtn.click();
		termsofservicecheckbox.click();
		shippingchkotBtn.click();
		paybycheckBtn.click();
		confirmorderBtn.click();

	}


}
