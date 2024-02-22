package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
public WelcomePage(WebDriver driver) {
PageFactory.initElements(driver, this);
}
@FindBy(partialLinkText = "Log in")
WebElement loginLink;

public void clickLogin() {
	loginLink.click();
}

public void registerClick() {
	// TODO Auto-generated method stub
	
}}