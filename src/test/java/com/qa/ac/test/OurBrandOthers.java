package com.qa.ac.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurBrandPom;

public class OurBrandOthers extends BaseClass {

	@Test
	public void ourBrandBabyCare() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Homepage h = new Homepage(driver);
		h.ourbrand.click();
		Thread.sleep(2000);
		OurBrandPom brandPom = new OurBrandPom(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement other = brandPom.getOthers();
		jExecutor.executeScript("arguments[0].click();", other);
		Thread.sleep(2000);
		System.out.println("Title of page is " + driver.getTitle());

		WebElement Addermis = brandPom.getAddermis();
		jExecutor.executeScript("arguments[0].click();", Addermis);
		Thread.sleep(2000);
		String Addermist = driver.getTitle();
		System.out
				.println("'In Other ' 'Addermis' sub category is displaying fine and Title of page is :-" + Addermist);
		driver.navigate().back();

	}
}
