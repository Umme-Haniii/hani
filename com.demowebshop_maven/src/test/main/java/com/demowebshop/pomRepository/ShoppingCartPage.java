package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Base_Page{
	
		public ShoppingCartPage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath = "//table[@class='cart]/tbody/tr[1]/td[3]/a")
		private WebElement shoppigCartFirstRowProductName;

		public WebElement getShoppigCartFirstRowProductName() {
			return shoppigCartFirstRowProductName;
		}
		
	
}
