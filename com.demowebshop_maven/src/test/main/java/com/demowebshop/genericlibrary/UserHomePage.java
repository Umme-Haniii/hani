package com.demowebshop.genericlibrary;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends Base_Page {
	
		public UserHomePage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
		private WebElement loggedInEmailIDLink;

		public void clickEmailIDAccount() {
			loggedInEmailIDLink.click();
		}
		public WebElement getLoggedInEmailIDLink() {
			return loggedInEmailIDLink;
		}
		public WebElement getLogoutLink() {
			return getLogoutLink();
		}
		public void setLoggedInEmailIDLink(WebElement loggedINEmailIDLink) {
			this.loggedInEmailIDLink=loggedINEmailIDLink;
		}
		public void setLogoutLink(WebElement logoutLink) {
			this.loggedInEmailIDLink=logoutLink;
		}
		@FindBy(partialLinkText ="Log out")
		private WebElement logoutLink;
		
		public void clickLogoutLink() {
			logoutLink.click();
		}
	}


