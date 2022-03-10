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

public class newsSignUp extends BaseClass {
	@Test
	public void signUp() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		Homepage h = new Homepage(driver);
		WebElement nElement = h.getNewsroom();
		jExecutor.executeScript("arguments[0].click();", nElement);
		NewsroomPom nrp = new NewsroomPom(driver);
		WebElement signup = nrp.getSignupForNews();
		jExecutor.executeScript("arguments[0].click();", signup);
		Thread.sleep(3000);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("NRtitle");
		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of  NewsRoom page is match,actualTitle is equal to expectedTitle ");
		boolean verifySignUpHeading = nrp.getSignUpHeading().isDisplayed();
		System.out
				.println(" 'SignUp Heading For News' is Displaying in Signup newsroom page,  expected :-True/False :- "
						+ verifySignUpHeading);
		String tString = nrp.getSignUpHeading().getText();
		System.out.println(" ' The text of SignUp Heading is  :- " + tString);
		boolean verifySignUpImage = nrp.getSignUpImage().isDisplayed();
		System.out
				.println(" ' In News SignUp Page' 'Image' is Display ,  expected :-True/False :- " + verifySignUpImage);
		boolean verifyHeadingBlock = nrp.getSignUpHeadingNewsText().isDisplayed();
		System.out
				.println(" ' Text is display under SignUp Heading'  in SignUp newsroom page,  expected :-True/False :- "
						+ verifyHeadingBlock);
		String txString = nrp.getSignUpHeadingNewsText().getText();
		System.out.println(" ' The text  under SignUp Heading is    :- " + txString);
		boolean verifySihnUpSubSection = nrp.getSignUpSrction().isDisplayed();
		System.out.println(" 'Sign Up Sub Section' is Display  under SignUp newsroom page,  expected :-True/False :- "
				+ verifySihnUpSubSection);
		String tsString = nrp.getSignUpSrction().getText();
		System.out.println(" ' The text  under SignUp Heading is    :- " + tsString);

	}
}