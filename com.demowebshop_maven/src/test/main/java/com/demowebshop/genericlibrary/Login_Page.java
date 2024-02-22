package com.demowebshop.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demowebshop.pomRepository.Base_Page;

public class Login_Page extends Base_Page {

	public Login_Page(WebDriver driver) {
		super(driver);
		
	}
@FindBy(id="Email")
WebElement emailTextField;

public void enterEmail(String email) {
	emailTextField.sendKeys(email);
}
@FindBy(id="password")
WebElement passwordTextField;

public void enterPassword(String password) {
	passwordTextField.sendKeys(password);
}
@FindBy(xpath = "//input[@value='log in']")
WebElement loginButton;

public void clickinButton() {
	loginButton.click();
}
}
