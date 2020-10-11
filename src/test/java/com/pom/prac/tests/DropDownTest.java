package com.pom.prac.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.pom.prac.base.Base;
import com.pom.prac.pages.DropDownPage;

@Test
public class DropDownTest {

	//WebDriver driver = Base.setupDriverForDropDowns();
	//DropDownPage dropDownPage = new DropDownPage(driver);
	//Base base = new Base();

	/*
	 * @BeforeTest public void beforeTest() { Base.getDriver(); }
	 */

	/*
	 * @AfterMethod public void driverQuitMethod() { WebDriver driver =
	 * Base.setupDriverForDropDowns(); DropDownPage dropDownPage = new
	 * DropDownPage(driver); dropDownPage.closeDriver(); }
	 */

	@Test
	public void averifyadeals() {
		WebDriver driver = Base.setupDriverForDropDowns();
		DropDownPage dropDownPage = new DropDownPage(driver);
		dropDownPage.clickDeals();
		driver.quit();
	}

	@Test
	public void verifyThatTheALandingPageIsNavigatingCorrectly() {
		WebDriver driver = Base.setupDriverForDropDowns();
		DropDownPage dropDownPage = new DropDownPage(driver);
		dropDownPage.selectCurrency();
		Assert.assertEquals(dropDownPage.getSelectedCurrencyValue(), "AED");
		driver.quit();
	}

	@Test
	public void verifyThatTheFromAndToIsSelectingCorrectly() throws InterruptedException {
		WebDriver driver = Base.setupDriverForDropDowns();
		DropDownPage dropDownPage = new DropDownPage(driver);
		dropDownPage.clickFromDropDown();
		dropDownPage.selectBengaluru();

		dropDownPage.clickToDropDown();
		dropDownPage.selectChennai();
		Assert.assertEquals(dropDownPage.getSelectedChennai(), "Chennai (MAA)");
		Assert.assertEquals(dropDownPage.getSelectedBengaluru(), "BLR");
		driver.quit();
	}

}
