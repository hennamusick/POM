package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.prac.base.Base;
import com.pom.prac.pages.LandingPage;

public class LoginTest {

	@Test
	public void verifyThatTheLandingPageIsNavigatedCorrectly() {

		WebDriver driver = Base.setupDriver();
		LandingPage landingPage = new LandingPage(driver);
		landingPage.findingFlightfromDepartureToDestination();
		Assert.assertEquals(landingPage.getHeaderTextOfFlightBookingPage(), "Flights from Boston to Berlin:");
		landingPage.quitDriver();
	}
}
