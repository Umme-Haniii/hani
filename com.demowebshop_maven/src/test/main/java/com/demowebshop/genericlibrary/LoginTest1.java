package com.demowebshop.genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.Debug;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.pomRepository.WelcomePage;

public class LoginTest1 extends Base_Test {
	
	
	public void tc () throws InterruptedException{
		WelcomePage wp=new WelcomePage(driver);
		wp.clickLogin();
		Thread.sleep(2000);
	}

	
		

	}


