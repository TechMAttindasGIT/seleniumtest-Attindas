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
import com.qa.ac.pom.NewsroomPom;

public class LatestNews extends BaseClass {
	@Test
	public void latestNews() throws InterruptedException, IOException {

		Homepage h = new Homepage(driver);

		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement nElement = h.getNewsroom();
		jExecutor.executeScript("arguments[0].click();", nElement);

		NewsroomPom nrp = new NewsroomPom(driver);
		boolean verifyLatestAllNews = nrp.getViewAllLatestNewsLink().isDisplayed();
		System.out.println(" 'View All Latest News' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyLatestAllNews);
		WebElement allNewsLink = nrp.getViewAllLatestNewsLink();
		jExecutor.executeScript("arguments[0].click();", allNewsLink);
		Thread.sleep(3000);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("nLtitle");
		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of All Latest News page is match,actualTitle is equal to expectedTitle ");
		driver.navigate().back();
		WebElement allNewsTitle = nrp.getNewsTitle();
		jExecutor.executeScript("arguments[0].click();", allNewsTitle);
		String tString = driver.getTitle();
		if (tString.contains("HDIS Celebrates A Decade Of Top Workplace Wins")) {

			System.out.println(" 'Title is matched' " + tString);
		} else {
			System.out.println("Page title does not match ");
		}
		Thread.sleep(2000);
		boolean verifyNewsHeading = nrp.getHeaderOfNews().isDisplayed();
		System.out.println(
				" 'News Heading ' is Displaying after clink on News ,  expected :-True/False :- " + verifyNewsHeading);
		if (driver.getPageSource().contains("That statement sums up just one of the reasons HDIS was named")) {
			System.out.println("Text is present and text is talking about the News");
		} else {
			System.out.println("Text is absent");
		}
		driver.navigate().back();
		boolean verifyLatestNewsImage = nrp.getLatestNewsImage().isDisplayed();
		System.out.println(
				" ' News Image ' is Displaying in newsroom page,  expected :-True/False :- " + verifyLatestNewsImage);
		boolean verifyNewsDate = nrp.getNewsDate().isDisplayed();
		System.out.println(" 'News Date' is Displaying in newsroom page,  expected :-True/False :- " + verifyNewsDate);

	}
}