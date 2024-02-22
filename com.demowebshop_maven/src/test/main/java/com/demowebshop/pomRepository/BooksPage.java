package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends Base_Page {

	public BooksPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath = "//a[text()='Computing and Internet']/parent::h2/..//input")
		private WebElement computingAndInternetAddtoCartButton;
		
		void clickcomputingAndInternetAddtocartbutton() {
			computingAndInternetAddtoCartButton.click();
		} 
		@FindBy(xpath = "//a[text()='shopping cart']")
		private WebElement shoppingCartLinkAfterAddedToCart;
		
		public void clickBnnerShoppingCartLink() {
			shoppingCartLinkAfterAddedToCart.click();
	}

}
