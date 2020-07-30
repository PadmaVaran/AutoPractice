package com.scripts.AutoPractice;

import org.testng.annotations.Test;

import com.generics.AutoPractice.BaseTest;
import com.pages.AutoPractice.POMAutoPracticeRegistrationPage;

public class TESTAutoPracticeRegistration extends BaseTest
{
  @Test
  public void registration()
  {
	  POMAutoPracticeRegistrationPage registration = new POMAutoPracticeRegistrationPage(driver);
			  registration.submitDetails();
  }
}
