package com.pom.prac.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver setupDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com");
		return driver;
	}
	
	public static WebDriver setupDriverForDropDowns() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		return driver;
	}
	
	public static WebDriver setupDriverAutoSuggestions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		return driver;
	}
	
	public static WebDriver setupDriverForWindowAlert() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		return driver;
	}
}
