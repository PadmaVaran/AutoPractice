package com.scripts.AutoPractice;

import org.testng.annotations.Test;

import com.generics.AutoPractice.BaseTest;
import com.pages.AutoPractice.POMAutoPracticeOrderPage;

public class TESTAutoPracticeOrder extends BaseTest
{
	@Test
	public void order()
	{

	POMAutoPracticeOrderPage o = new POMAutoPracticeOrderPage(driver);
	o.orderSubmit();
	}
}
