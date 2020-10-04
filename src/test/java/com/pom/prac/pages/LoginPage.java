package com.pom.prac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.prac.base.Utilities;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='login1']") // By username =
	// By.xpath(".//*[@id='login1']");
	WebElement username_email;

	@FindBy(name = "passwd") // By passwd = By.name("passwd");
	WebElement password;

	@FindBy(name = "proceed") // By go = By.name("proceed");
	WebElement goButton;
	// By home = By.linkText("Home");

	public void setEmailId(String username) {
		Utilities.waitForClick(username_email);
		username_email.clear();
		username_email.sendKeys(username);
	}

	public void setPassword(String passwd) {
		password.clear();
		password.sendKeys(passwd);

	}

	public void goButton() {
		goButton.click();
	}

	public void home() {
	}


}
