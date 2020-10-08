package com.pom.prac.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;


public class AutoSuggestivePage {

	WebDriver driver;

	public AutoSuggestivePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "autosuggest")
	WebElement countrySearch;
	
	@FindBy(css = "li[class='ui-menu-item'] a")
	List<WebElement> suggestedValues;
	
	public void addTextToCountrySearch(String countrySearchText) {
		countrySearch.sendKeys(countrySearchText);
	}
	
	public void selectOneWebElementOfList() {
		Utilities.waitForVisibilityOfList(suggestedValues);
		for(WebElement suggestedValue:suggestedValues) {
			if(suggestedValue.getText().equalsIgnoreCase("India")) {
				suggestedValue.click();
				break;
			}
		}
	}
}
