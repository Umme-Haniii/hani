package com.demowebshop.genericlibrary;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
			@FindBy(id="gender-male")
			WebElement maleRadioBtn;
			
			@FindBy(id="FirstName")
			WebElement FNameTxtFld;
			
			@FindBy(id="LastName")
			WebElement LNameTxtFld;
			
			@FindBy(id="Email")
			WebElement EmailTxtFld;
			
			@FindBy(id="Password")
			WebElement PwdTxtFld;
			
			@FindBy(id="ConfirmPassword")
			WebElement ConPwdTxtFld;
			
			@FindBy(id="register-button")
			WebElement RegBtn;
			
			public void registerPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			public void registerUser() {
				maleRadioBtn.click();
				FNameTxtFld.sendKeys("Mathi");
				LNameTxtFld.sendKeys("Khan");
				EmailTxtFld.sendKeys("mathiKhan"+getRandom()+"@gmail.com");
				PwdTxtFld.sendKeys("Mk@123");
				ConPwdTxtFld.sendKeys("Mk@123");
				RegBtn.click();
				
			}

			public int getRandom() {
				Random r = new Random();
				int random = r.nextInt(10000);
				return random;
			


	}

}
