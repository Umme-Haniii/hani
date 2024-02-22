package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.genericlibrary.Frameworklibraray;

public class Base_Page extends Frameworklibraray {
public Base_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
