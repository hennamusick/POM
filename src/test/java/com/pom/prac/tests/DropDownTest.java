package com.pom.prac.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.pom.prac.base.Base;
import com.pom.prac.pages.DropDownPage;


@Test
public class DropDownTest {

	/*
	 * WebDriver driver = BaseDropDowns.setupDriver();
	 * 
	 * @Test public void verifyThatCurrencySelectCorrectly() {
	 * 
	 * DropDownPage dropDownPage = new DropDownPage(driver);
	 * dropDownPage.selectCurrency(); }
	 */
	
	WebDriver driver = Base.setupDriver();

	@Test
	public void verifyThatTheLandingPageIsNavigatedCorrectly() {
		
		//WebDriver driver = Base.setupDriver();
		DropDownPage dropDownPage = new DropDownPage(driver);
		dropDownPage.selectCurrency();
	}
}
