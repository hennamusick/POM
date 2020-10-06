package com.pom.prac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.mustache.Value;

import com.pom.prac.base.Utilities;

public class DropDownPage {

	WebDriver driver;

	public DropDownPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void closeDriver() {
		driver.close();
	}

	public void openDriver() throws InterruptedException {
		driver.navigate().wait(10000);
	}

	@FindBy(id = "ctl00_mainContent_DropDownListCurrency")
	WebElement currency;

	@FindBy(id = "ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement fromDropDown;

	@FindBy(xpath = "//a[@value ='BLR']")
	WebElement bengaluru;

	@FindBy(id = "ctl00_mainContent_ddl_destinationStation1_CTXT")
	WebElement toDropDown;

	@FindBy(xpath = "(//a[@value ='MAA'])[2]")
	WebElement chennai;

	@FindBy(xpath = "//a[contains(text(),'DEALS')]")
	WebElement dealsLink;

	public void selectCurrency() {
		Utilities.waitForVisibility(currency);
		Select select = new Select(currency);
		select.selectByValue("AED");
	}

	public String getSelectedCurrencyValue() {
		return currency.getAttribute("value");
	}

	public void clickFromDropDown() {
		Utilities.waitForClick(fromDropDown);
		fromDropDown.click();
	}

	public void selectBengaluru() {
		Utilities.waitForClick(bengaluru);
		bengaluru.click();
	}

	public String getSelectedBengaluru() {
		return bengaluru.getAttribute("value");
	}

	public void clickToDropDown() {
		Utilities.waitForClick(toDropDown);
		toDropDown.click();
	}

	public void selectChennai() {
		Utilities.waitForClick(chennai);
		chennai.click();
	}

	public String getSelectedChennai() {
		return toDropDown.getAttribute("value");
	}

	public void clickDeals() {
		Utilities.waitForClick(dealsLink);
		dealsLink.click();
	}
}
