package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends Base_Page {
	
public WelcomePage(WebDriver driver) {
	super(driver);
}

//PageFactory.initElements(driver, this);

@FindBy(partialLinkText = "Log in")
WebElement loginLink;

public void clickLogin() {
	loginLink.click();
}
@FindBy(partialLinkText = "Register")
WebElement registerLink;


public void clickRegsiterLink() {
	registerLink.click();
	
}}