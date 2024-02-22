package com.demowebshop.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		@FindBy(id = "Email")
		WebElement emailTxtFld;
		
		@FindBy(id = "Password")
		WebElement pwdTxtFld;
		
		@FindBy(xpath = "//input[@value='Log in']")
		WebElement logInBtn;

		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void performLogin() {
			emailTxtFld.sendKeys("Mathi12345@gmail.com");
			pwdTxtFld.sendKeys("Mathi@123");
			logInBtn.click();
		}
}
