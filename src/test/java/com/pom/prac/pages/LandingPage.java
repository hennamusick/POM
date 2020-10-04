package com.pom.prac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pom.prac.base.Utilities;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "fromPort")
	WebElement departureCity;

	@FindBy(name = "toPort")
	WebElement destinationCity;

	@FindBy(xpath = "//input[@value = 'Find Flights']")
	WebElement findFlightButton;

	@FindBy(xpath = "/html/body/div[2]/h3")
	WebElement headerTextOfFlightBookingPage;

	String departureCity1 = "Boston";
	String destinationCity1 = "Berlin";

	public void selectDepartureCity() {
		Utilities.waitForVisibility(departureCity);
		Select select = new Select(departureCity);
		select.selectByVisibleText(departureCity1);
	}

	public void selectDestinationCity() {
		Utilities.waitForVisibility(destinationCity);
		Select select = new Select(destinationCity);
		select.selectByVisibleText(destinationCity1);
	}

	public void clickFindFlightButton() {

		Utilities.waitForClick(findFlightButton);
		findFlightButton.click();
	}

	public void findingFlightfromDepartureToDestination() {
		selectDepartureCity();
		selectDestinationCity();
		clickFindFlightButton();
	}

	public String getHeaderTextOfFlightBookingPage() {
		return headerTextOfFlightBookingPage.getText();

	}

	public void quitDriver() {
		driver.close();
	}

}
