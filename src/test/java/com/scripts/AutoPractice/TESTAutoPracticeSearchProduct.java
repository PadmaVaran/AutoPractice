package com.scripts.AutoPractice;

import org.testng.annotations.Test;

import com.generics.AutoPractice.BaseTest;
import com.pages.AutoPractice.POMAutoPracticeSearchPage;

public class TESTAutoPracticeSearchProduct extends BaseTest
{
  @Test
  public void search()
  {
	  POMAutoPracticeSearchPage search = new POMAutoPracticeSearchPage(driver);
	  search.searchProduct();
  }
}
