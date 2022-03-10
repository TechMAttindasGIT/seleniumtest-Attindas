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
import com.qa.ac.pom.NewsroomPom;

public class Newsroom extends BaseClass {
	@Test
	public void NewsRoom() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		boolean news = h.getNewsroom().isDisplayed();
		if (news == true) {
			String text = h.getNewsroom().getText();
			System.out.println(
					"'In Home Page ' 'Newsroom' sub category is displaying fine  and text of sub Categoty is :- "
							+ text);
		} else {
			System.out.println("Newsroom is not present");
		}
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement nElement = h.getNewsroom();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(3000);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("ntitle");
		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of  NewsRoom page is match,actualTitle is equal to expectedTitle ");

		NewsroomPom nrp = new NewsroomPom(driver);
		boolean verifyImage = nrp.getNewsImage().isDisplayed();
		System.out.println(" 'Banner Image' is Displaying in newsroom page,  expected :-True/False :- " + verifyImage);

		boolean verifyblock = nrp.getNewsBlock().isDisplayed();
		System.out.println(" 'Content Block' is Displaying in newsroom page,  expected :-True/False :- " + verifyblock);
		boolean verifyLatestNewsHeading = nrp.getLatestNewsHeading().isDisplayed();
		System.out.println(" 'Latest News Heading' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyLatestNewsHeading);
		boolean verifyLatestAllNews = nrp.getViewAllLatestNewsLink().isDisplayed();
		System.out.println(" ' View All Latest News' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyLatestAllNews);

		boolean verifyPressRelease = nrp.getPressrelease().isDisplayed();
		System.out.println(" ' Press Release Heading' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyPressRelease);
		boolean verifyPressAllRelase = nrp.getViewAllPressNewsLink().isDisplayed();
		System.out.println(" '  View All Press Release' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyPressAllRelase);

		boolean verifySignUpForNew = nrp.getSignupForNews().isDisplayed();
		System.out.println(
				" 'SignUp For News' is Displaying in newsroom page,  expected :-True/False :- " + verifySignUpForNew);

		boolean verifyMidaContacts = nrp.getMidiaContacts().isDisplayed();
		System.out.println(
				" 'Midia Contact' is Displaying in newsroom page,  expected :-True/False :- " + verifyMidaContacts);

		boolean verifyVideoLibrary = nrp.getVideoLibrary().isDisplayed();
		System.out.println(" 'video Library Heading ' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyVideoLibrary);
		boolean verifyVideo = nrp.getVideoLink().isDisplayed();
		System.out.println(" 'video' is Displaying in newsroom page,  expected :-True/False :- " + verifyVideo);
		if (true) {
			WebElement videoBtn = nrp.getVideoplay();
			jExecutor.executeScript("arguments[0].click();", videoBtn);
			Thread.sleep(2000);
			System.out.println(" 'video' is Clickable in newsroom page,  expected :-True/False :- ");
		}
	}
}