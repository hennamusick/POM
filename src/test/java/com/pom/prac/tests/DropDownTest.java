package com.pom.prac.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.pom.prac.base.Base;
import com.pom.prac.pages.DropDownPage;

@Test
public class DropDownTest {

	WebDriver driver = Base.setupDriverForDropDowns();
	DropDownPage dropDownPage = new DropDownPage(driver);

	/*
	 * @BeforeTest public void beforeEachMethod() { Base.setupWebDriver(); }
	 */

	/*
	 * @AfterMethod public void afterEachMethod() { Base.endTheStage(); }
	 */
	

	@Test
	public void averifyadeals() {
		dropDownPage.clickDeals();
	}

	@Test
	public void verifyThatTheALandingPageIsNavigatingCorrectly() {
		dropDownPage.selectCurrency();
		Assert.assertEquals(dropDownPage.getSelectedCurrencyValue(), "AED");
	}

	@Test
	public void verifyThatTheFromAndToIsSelectingCorrectly() throws InterruptedException {
		dropDownPage.clickFromDropDown();
		dropDownPage.selectBengaluru();

		dropDownPage.clickToDropDown();
		dropDownPage.selectChennai();
		Assert.assertEquals(dropDownPage.getSelectedChennai(), "Chennai (MAA)");
		Assert.assertEquals(dropDownPage.getSelectedBengaluru(), "BLR");
	}

}
