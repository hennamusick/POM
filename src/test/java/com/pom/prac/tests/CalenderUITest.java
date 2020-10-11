package com.pom.prac.tests;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.prac.base.Base;
import com.pom.prac.pages.CalenderUIPage;
import com.pom.prac.pages.DropDownPage;

public class CalenderUITest {

	@Test
	public void verifyThatCurrentDayIsPickedUpCorrectly() {
		WebDriver driver = Base.setupDriverForDropDowns();
		DropDownPage dropDownPage = new DropDownPage(driver);
		CalenderUIPage calenderUIPage = new CalenderUIPage(driver);
		dropDownPage.selectBothFromAndToWithValues();
		calenderUIPage.selectDayOfToday();
		System.out.println(calenderUIPage.getDepartDate());

		LocalDate localDate = LocalDate.now();
		System.out.println(":" + localDate.getDayOfMonth()); // 8
		System.out.println(":" + localDate.getMonthValue()); // 10

		if (localDate.getDayOfMonth() < 10 && localDate.getMonthValue() < 10) {
			Assert.assertEquals(calenderUIPage.getDepartDate(),
					"0" + (localDate.getDayOfMonth() + "/0" + (localDate.getMonthValue())));
			System.out.println("Length:<=10,<=10 ");
		} else if (localDate.getDayOfMonth() < 10 && localDate.getMonthValue() >= 10) {
			Assert.assertEquals(calenderUIPage.getDepartDate(),
					"0" + (localDate.getDayOfMonth() + "/" + (localDate.getMonthValue())));
			System.out.println("Length:>=10,<10 ");
		} else if (localDate.getDayOfMonth() >= 10 && localDate.getMonthValue() >= 10) {
			Assert.assertEquals(calenderUIPage.getDepartDate(),
					(localDate.getDayOfMonth() + "/" + (localDate.getMonthValue())));
			System.out.println("Length:>=10,>=10 ");
		} else if (localDate.getDayOfMonth() >= 10 && localDate.getMonthValue() < 10) {
			Assert.assertEquals(calenderUIPage.getDepartDate(),
					(localDate.getDayOfMonth() + "/0" + (localDate.getMonthValue())));
			System.out.println("Length:<10,>=10 ");
		}
		driver.quit();
	}

}
