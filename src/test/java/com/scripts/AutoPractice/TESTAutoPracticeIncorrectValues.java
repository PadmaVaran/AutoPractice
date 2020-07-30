package com.scripts.AutoPractice;

import org.testng.annotations.Test;

import com.generics.AutoPractice.BaseTest;
import com.pages.AutoPractice.POMAutoPracticeIncorrectValuesPage;

public class TESTAutoPracticeIncorrectValues extends BaseTest
{
	@Test
	public void values()
	{
		POMAutoPracticeIncorrectValuesPage values = new POMAutoPracticeIncorrectValuesPage(driver);
		values.incorrectValues();
	}
}
