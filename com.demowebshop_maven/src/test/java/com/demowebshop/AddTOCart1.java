package com.demowebshop;

import java.io.ObjectInputFilter.Status;
import java.sql.Driver;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;import org.testng.asserts.SoftAssert;

import com.demowebshop.genericlibrary.Base_Test;
import com.demowebshop.genericlibrary.BooksPage;
import com.demowebshop.genericlibrary.ExelRead;
import com.demowebshop.genericlibrary.LoginPage;
import com.demowebshop.genericlibrary.ShoppingCartPage;
import com.demowebshop.genericlibrary.WelcomePage;

public class AddTOCart1  extends Base_Test{
@Test(dataProvider = "addToCart")
	public void Tc_shoppingcart_001(String email, String password) {
	WelcomePage wp=new WelcomePage(driver);
	wp.clickLogin();
	test.log(Status.INFO,"Login page is displayed");
			LoginPage lp=new LoginPage(driver);
	LoginPage.enterEmail(email);
	LoginPage.enterPassword(password);
	LoginPage.clickLoginButton();
	HomePage hp=new HomePage(driver);
	try {
		softAssert.assertTrue(hp.getLogoutLink().isDisplayed());
		if(hp.getLogoutLinl().isDisplayed();
		test.log(Status.PASS, "User is successfully logged in");
		wp.clickheaderBooksLink();
		BooksPage.bp=new BooksPage(driver);
		bp.clickcomputingAndInternetAddtoCartButton();
		bp.clickBannerShoppingCartLink();
		ShoppingCartPage sc=new ShoppingCartPage(driver);
		softAssert.assertTrue(ShoppingCartPage.getShoppingCartFirstRowProductName().getText().contains("computing and internet"));
		test.log(Status.PASS,"Product is added to cart");
	}
	} catch (Exception e) {
		e.printStackTrace();
		test.log(Status.FAIL, "User is not logged in and product is not added to cart");
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(takescreenshot(driver)).build();
		Reporter.log("user not logged in");
		}
}
@DataProvider(name= "addToCart")
public String[][] addToCartDataProvider()
return ExelRead.multipleRead("AddToCart");

	
		

	}

}
