package com.scripts.AutoPractice;

import org.testng.annotations.Test;

import com.generics.AutoPractice.BaseTest;
import com.pages.AutoPractice.POMAutoPracticeWishListPage;

public class TESTAutoPracticeWishList extends BaseTest
{
	@Test
	public void wish()
	{
		POMAutoPracticeWishListPage wish = new POMAutoPracticeWishListPage(driver);
		wish.wishList();
	}
}
