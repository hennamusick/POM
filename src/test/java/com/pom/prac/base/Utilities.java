package com.pom.prac.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	private static WebDriverWait wait = new WebDriverWait(Base.getDriver(), 30);

	public static void waitForClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitForVisibilityOfElementLocated(WebElement element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}

	public static void waitForVisibilityOf(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/*
	 * public static void waitForVisibilityOfList(List<WebElement> elements) {
	 * wait.until(ExpectedConditions.visibilityOfElementLocated((By) elements)); }
	 */

	public static void waitForVisibilityOfList(List<WebElement> elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

}
