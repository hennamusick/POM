package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.prac.base.Base;
import com.pom.prac.pages.LoginPage;

public class LoginTest {

	@Test
	public void loginTest() {
		
		WebDriver driver = Base.setupDriver();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setEmailId("username@gmail.com");
		loginPage.setPassword("password");
		loginPage.goButton();
	}
}
