package com.pom.prac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class EnableAndDisablePage {

	WebDriver driver;

	public EnableAndDisablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='ctl00_mainContent_rbtnl_Trip_0']")
	WebElement oneWayRadioButton;
	
	@FindBy(xpath = "//input[@id='ctl00_mainContent_rbtnl_Trip_1']")
	WebElement roundTripRadioButton;
	
	@FindBy(id = "Div1")
	WebElement returnDateCalenderPanel;
	
	public void selectOneWayRadioButton() {
		Utilities.waitForVisibilityOf(oneWayRadioButton);
		oneWayRadioButton.click();
	}
	
	public void selectRoundTripRadioButton() {
		Utilities.waitForVisibilityOf(roundTripRadioButton);
		Utilities.waitForClick(roundTripRadioButton);
		roundTripRadioButton.click();
	}
	
	public String getReturnDateStyle() {
		Utilities.waitForVisibilityOf(returnDateCalenderPanel);
		return returnDateCalenderPanel.getAttribute("style");
	}
}
