package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurBrandPom;

public class OurBrand extends BaseClass {
	@Test
	public void Ourbrand() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		h.ourbrand.click();
		Thread.sleep(3000);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("Bptitle");
		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of our Brand page is match actualTitle is equal to expectedTitle ");
		OurBrandPom brandPom = new OurBrandPom(driver);

		if (brandPom.getBrandImage().isDisplayed()) {
			System.out.println("In Our Brand page Image is Displaying");
		} else {
			System.out.println("In Our Brand page Image is not Displaying");
		}

		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		boolean verifyadults = brandPom.getAdult().isDisplayed();
		System.out.println(" 'Adult Incontinence' are Displaying fine expected :-True/False :- " + verifyadults);
		WebElement adults = brandPom.getAdult();
		jExecutor.executeScript("arguments[0].click();", adults);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		boolean verifyclinical = brandPom.getClinical().isDisplayed();
		System.out.println(" 'Clinical' are Displaying fine expected :-True/False :- " + verifyclinical);
		WebElement clinical = brandPom.getClinical();
		jExecutor.executeScript("arguments[0].click();", clinical);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		boolean verifyall = brandPom.getAll().isDisplayed();
		System.out.println(" 'All' are Displaying fine expected :-True/False :- " + verifyall);
		WebElement all = brandPom.getAll();
		jExecutor.executeScript("arguments[0].click();", all);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		boolean verifybabycare = brandPom.getBabycare().isDisplayed();
		System.out.println(" 'Baby Care ' are Displaying fine expected :-True/False :- " + verifybabycare);
		WebElement babycare = brandPom.getBabycare();
		jExecutor.executeScript("arguments[0].click();", babycare);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		boolean verifyothers = brandPom.getOthers().isDisplayed();
		System.out.println(" 'Others' are Displaying fine expected :-True/False :- " + verifyothers);
		WebElement others = brandPom.getOthers();
		jExecutor.executeScript("arguments[0].click();", others);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);

	}

}
