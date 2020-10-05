package com.pom.prac.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseDropDowns {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver setupDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--incognito");
		desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		return driver;
	}
	
	public void quitDriver() {
		driver.quit();
	}
	
}
