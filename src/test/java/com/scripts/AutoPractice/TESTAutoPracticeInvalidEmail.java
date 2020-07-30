package com.scripts.AutoPractice;

import org.testng.annotations.Test;

import com.generics.AutoPractice.BaseTest;
import com.pages.AutoPractice.POMAutoPracticeInvalidEmailPage;

public class TESTAutoPracticeInvalidEmail extends BaseTest
{
	@Test
	public void invalid()
	{
		POMAutoPracticeInvalidEmailPage invalid = new POMAutoPracticeInvalidEmailPage(driver);
		invalid.invalidLEmail();
	}
}
