package com.pom.prac.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChecksBoxPage {

	WebDriver driver;

	public ChecksBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[type='checkbox']")
	List<WebElement> checkBoxes;

	public void selectFamilyAndFriendsCheckbox() {
		for (WebElement checkBox : checkBoxes) {
			if (checkBox.getAttribute("name").equalsIgnoreCase("ctl00$mainContent$chk_StudentDiscount")) {
				System.out.println(checkBox.isSelected());
				checkBox.click();
				System.out.println(checkBox.isSelected());
				break;
			}
		}
	}
}
