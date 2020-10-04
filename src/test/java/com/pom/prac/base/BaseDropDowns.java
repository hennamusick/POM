package com.pom.prac.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDropDowns {

	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver setupDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		return driver;
	}
}
