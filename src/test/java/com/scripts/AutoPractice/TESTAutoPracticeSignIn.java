package com.scripts.AutoPractice;

import org.testng.annotations.Test;

import com.generics.AutoPractice.BaseTest;
import com.pages.AutoPractice.POMAutoPracticeSignInPage;

public class TESTAutoPracticeSignIn extends BaseTest
{
  @Test
  public void signin() 
  {
	  POMAutoPracticeSignInPage s = new POMAutoPracticeSignInPage(driver);
	  s.login();
  }
}
