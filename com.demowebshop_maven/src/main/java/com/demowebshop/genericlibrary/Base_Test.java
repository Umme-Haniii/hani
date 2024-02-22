package com.demowebshop.genericlibrary;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry.Initial;

public class Base_Test extends Frameworklibraray {
WebDriver driver;

@BeforeMethod
public void browserSetup() throws IOException {
	if(getPropertyValue("browser").equals("chrome")) {
	driver=new ChromeDriver();
}
	else if(getPropertyValue("browser").equals("firefox")) {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("url");
	initObjects(driver);	}


@AfterMethod(alwaysRun=true)
public void browserTearDown() {
	driver.quit();
	SoftAssert.assertAll(;)
	

	}

}
