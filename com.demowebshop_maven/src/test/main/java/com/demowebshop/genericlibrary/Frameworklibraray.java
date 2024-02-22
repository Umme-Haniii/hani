
package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import dev.failsafe.Timeout;

public class Frameworklibraray {

	private static final long TIMEOUT = 0;
	public static void selectClass(WebElement dropdown, String option) {
		Select select = new Select(dropdown);
		int counter = 0;
		try {
			int indexvalue = Integer.parseInt(option);
			select.selectByIndex(indexvalue);
			counter++;
		} catch (Exception e) {
			System.out.println("not an index value");
		}
		if (counter == 0) {
			try {
				select.selectByValue(option);
			} catch (Exception e) {
				select.selectByVisibleText(option);
			}
		}
	}
	public void takescreenshot(WebDriver driver) throws IOException {
		LocalDateTime dateTime=LocalDateTime.now();
		String filename = dateTime.toString().replaceAll(":", "-");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/zomatoapplication.png");
		try {
			
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	public void takescreenshotofelement(WebElement element) {
		File src = element.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/Element"+name()+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
	}

}
	private String name() {
		
		LocalDateTime dateTime=LocalDateTime.now();
		String filename = dateTime.toString().replaceAll(":", "-");
		return filename;
	}
	public String getPropertyValue(String key) throws IOException
	{
File f=new File(".\\src\\test\\resources\\propertyfile");
FileInputStream fis=new FileInputStream(f);
Properties p=new Properties();
p.load(fis);
return p.getProperty(key);
	}
public void  initObjects(WebDriver driver) {
	Actions a =new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
	SoftAssert SoftAssert = new SoftAssert();
}
}
