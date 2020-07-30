package com.scripts.AutoPractice;

import org.testng.annotations.Test;

import com.generics.AutoPractice.BaseTest;
import com.pages.AutoPractice.POMAutoPracticeMandatoryFieldsPage;

public class TESTAutoPracticeMandatoryFields extends BaseTest
{
	@Test
	public void mandatory()
	{
		POMAutoPracticeMandatoryFieldsPage mandatory = new POMAutoPracticeMandatoryFieldsPage(driver);
		mandatory.mandatoryFields();
	}
}
