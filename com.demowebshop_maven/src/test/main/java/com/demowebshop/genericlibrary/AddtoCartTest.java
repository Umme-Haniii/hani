package com.demowebshop.genericlibrary;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddtoCartTest  extends Base_Test{

		@Test
		public void TC_AddToCart001() {
			WelcomePage welcomePage = new WelcomePage(driver);
			welcomePage.ClickBookLink();
			BooksPage bookspage=new BooksPage(driver);
			bookspage.clickcomputingAndInternetAddtocartbutton();
			bookspage.clickBnnerShoppingCartLink();
			ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(shoppingCartPage.getShoppigCartFirstRowProductName().getText(), "Computing and Internet");
		}
	}

}
