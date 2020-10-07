package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.prac.base.Base;
import com.pom.prac.pages.ChecksBoxPage;

public class CheckBoxTest {

	WebDriver driver = Base.setupDriverForDropDowns();
	
	@Test
	public void verifyThatTheCheckBoxIsSelectingCorrectly() {
		ChecksBoxPage checksBoxPage = new ChecksBoxPage(driver);
		checksBoxPage.selectFamilyAndFriendsCheckbox();
	}
}
