package com.demowebshop.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	
		@FindBy(linkText = "Log in")
		WebElement logInLink;
		
		@FindBy(linkText = "Register")
		WebElement registerLink;
		
		public void welcomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void clickOnLogin() {
			logInLink.click();
		}
		
		public void clickOnRegister() {
			registerLink.click();
		}
		
	}


