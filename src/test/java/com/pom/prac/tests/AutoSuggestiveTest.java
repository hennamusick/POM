package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.prac.base.Base;
import com.pom.prac.pages.AutoSuggestivePage;

public class AutoSuggestiveTest {
	
	WebDriver driver = Base.setupDriverAutoSuggestions();
	AutoSuggestivePage autoSuggestivePage = new AutoSuggestivePage(driver);
	
	@Test
	public void verifyThatSuggestedValuesAreGettingDisplayedCorrectly() {
		autoSuggestivePage.addTextToCountrySearch("ind");
		autoSuggestivePage.selectOneWebElementOfList();
	}

}
