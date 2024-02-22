package com.demowebshop.genericlibrary;

import org.testng.annotations.Test;

import com.demowebshop.pomRepository.RegisterPage;
import com.demowebshop.pomRepository.UserHomePage;
import com.demowebshop.pomRepository.WelcomePage;

public class RegisterTest extends Base_Test {
	
		@Test
		public void TC_Register_001() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.registerClick();
		RegisterPage registerPage = new RegisterPage(driver);
			registerPage.register("m", "Anurag", "Dixit", "Hello@hahahehe.com", "Password@123", "Password@123");
		
		UserHomePage homePage = new UserHomePage(driver);
		softAssert.assertEquals("Hello@hahahehe.com", homePage.loggedInEmailID());
		}
	}

}
