package com.pom.prac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class CalenderUIPage {

	WebDriver driver;

	public CalenderUIPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".ui-state-default.ui-state-highlight")
	WebElement dayOfToday;
	
	@FindBy(name = "ctl00$mainContent$view_date1")
	WebElement departDate;
	
	public void selectDayOfToday() {
		Utilities.waitForVisibilityOf(dayOfToday);
		dayOfToday.click();
	}
	
	public String getDepartDate() {
		Utilities.waitForVisibilityOf(departDate);
		return departDate.getAttribute("value");
	}
	
}
