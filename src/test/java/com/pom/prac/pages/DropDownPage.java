package com.pom.prac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

	WebDriver driver;

	public DropDownPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ctl00_mainContent_DropDownListCurrency")
	WebElement currency;
	
	public void selectCurrency() {
		Select select = new Select(currency);
		select.selectByValue("AED");
	}
}
