package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		File f=new File(".\\src\\test\\resources\\propertyfile\\config.properties");
			FileInputStream fis=new FileInputStream(f);
			Properties p=new Properties();
			p.load(fis);
			System.out.println(p.getProperty("browser"));

	}

}
