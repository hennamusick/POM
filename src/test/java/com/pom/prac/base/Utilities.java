package com.pom.prac.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	private static WebDriverWait wait = new WebDriverWait(Base.getDriver(), 30);
	
	public static void waitForClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}
