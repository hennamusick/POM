package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.prac.base.Base;
import com.pom.prac.pages.DropDownPage;
import com.pom.prac.pages.EnableAndDisablePage;

public class EnableAndDisableTest {

	@Test
	public void verifyThatReturnDateIsEnabledAtTheBeginning() {
		WebDriver driver = Base.setupDriverForDropDowns();
		EnableAndDisablePage enableAndDisablePage = new EnableAndDisablePage(driver);
		DropDownPage DropDownPage = new DropDownPage(driver);

		Assert.assertEquals(false, enableAndDisablePage.getReturnDateStyle().contains("1"));
		DropDownPage.selectBothFromAndToWithValues();
		enableAndDisablePage.selectRoundTripRadioButton();
		Assert.assertEquals(true, enableAndDisablePage.getReturnDateStyle().contains("1"));
		enableAndDisablePage.selectOneWayRadioButton();
		Assert.assertEquals(true, enableAndDisablePage.getReturnDateStyle().contains("0.5"));
	}

}
