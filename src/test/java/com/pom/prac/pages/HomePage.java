package com.pom.prac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.id("srchword");
	By submit = By.xpath("//input[@type='submit']");
	
	public WebElement search() {
		return driver.findElement(search);
	}
	
	
	
}
