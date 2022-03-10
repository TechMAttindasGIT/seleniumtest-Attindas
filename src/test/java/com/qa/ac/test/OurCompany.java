package com.qa.ac.test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurCompanyPom;

@Test
public class OurCompany extends BaseClass {

	public void ourCompany() throws IOException, InterruptedException {

		Homepage h = new Homepage(driver);
		Thread.sleep(2000);
		h.getOurcompany().click();
		ExpTitle e = new ExpTitle();

		String expectedTitle = e.getExpTitle("HPtitle");

		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of our company page is match actualTitle is equal to expectedTitle ");

		if (driver.getPageSource().contains("Attindas is a global leader focused on absorbent adult")) {
			System.out.println("Content Block talking about the company");
		} else {
			System.out.println("Content Block talking Not about the company");

		}

		OurCompanyPom oCompany = new OurCompanyPom(driver);
		if (oCompany.getOcImage().isDisplayed()) {
			System.out.println("Image is Displaying in Our Company Page ");
			System.out.println("The Image Text is " + oCompany.getOcImage().getAttribute("alt"));
			if (oCompany.getOcImage().isEnabled()) {
				oCompany.getOcImage().click();
				System.out.println("Image is Clickable");
			}

		} else {
			System.out.println("Image is not Present as well as not clickable");
		}
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement OurBusiness = oCompany.getOurBusiness();
		jExecutor.executeScript("arguments[0].click();", OurBusiness);
		Thread.sleep(2000);
		String business = driver.getTitle();
		System.out.println("'In Our Company ' 'Our Business' sub category is displaying fine and Title of page is :-  "
				+ business);
		driver.navigate().back();

		WebElement OurPresence = oCompany.getOurPresence();
		jExecutor.executeScript("arguments[0].click();", OurPresence);
		Thread.sleep(2000);
		String presence = driver.getTitle();
		System.out.println("'In Our Company ' 'Our Presence' sub category is displaying fine and Title of page is :-  "
				+ presence);
		driver.navigate().back();
		WebElement MakeItPersonal = oCompany.getMakingItPersonal();
		jExecutor.executeScript("arguments[0].click();", MakeItPersonal);
		Thread.sleep(2000);
		String presonal = driver.getTitle();
		System.out.println(
				"'In Our Company ' 'Making it Personal' sub category is displaying fine and Title of page is :-  "
						+ presonal);
		driver.navigate().back();

		WebElement OurLeaders = oCompany.getOurLeaders();
		jExecutor.executeScript("arguments[0].click();", OurLeaders);
		Thread.sleep(2000);
		String leaders = driver.getTitle();
		System.out.println(
				"'In Our Company ' 'Our Leaders ' sub category is displaying fine and Title of page is :-  " + leaders);
		driver.navigate().back();
		WebElement OurPortfolio = oCompany.getOurPortfolio();
		jExecutor.executeScript("arguments[0].click();", OurPortfolio);
		Thread.sleep(2000);
		String Portfolio = driver.getTitle();
		System.out.println(
				"'In Our Company ' 'Our Portfolio Companies 'sub category is displaying fine and Title of page is :-  "
						+ Portfolio);
		driver.navigate().back();
		WebElement OurHistory = oCompany.getOurLeaders();
		jExecutor.executeScript("arguments[0].click();", OurHistory);
		Thread.sleep(2000);
		String history = driver.getTitle();
		System.out.println(
				"'In Our Company ' 'Our History' sub category is displaying fine and Title of page is :-  " + history);
		driver.navigate().back();

	}

}
