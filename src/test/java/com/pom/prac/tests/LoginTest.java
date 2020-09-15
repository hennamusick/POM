package com.pom.prac.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.prac.object.LoginPage;

public class LoginTest {

	@Test
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\Projects\\Browsers Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setEmailId("username@gmail.com");
		loginPage.setPassword("password");
		loginPage.goButton();
	}
}
