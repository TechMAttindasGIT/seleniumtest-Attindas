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

public class MediaContact extends BaseClass {
	@Test
	public void mediaContact() throws InterruptedException, IOException {

		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		Homepage h = new Homepage(driver);
		WebElement nElement = h.getNewsroom();
		jExecutor.executeScript("arguments[0].click();", nElement);
		NewsroomPom nrp = new NewsroomPom(driver);
		WebElement media = nrp.getMidiaContacts();
		jExecutor.executeScript("arguments[0].click();", media);
		Thread.sleep(3000);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("mtitle");
		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of  NewsRoom page is match,actualTitle is equal to expectedTitle ");
		boolean verifyContactUsImage = nrp.getContactUsImage().isDisplayed();
		System.out.println(
				" ' In News Contact Us Page' 'Image' is Display ,  expected :-True/False :- " + verifyContactUsImage);
		boolean verifyContactUsHeading = nrp.getContactUsHeading().isDisplayed();
		System.out.println(" 'Contact Us Heading' is Displaying in contact us  page,  expected :-True/False :- "
				+ verifyContactUsHeading);
		String tString = nrp.getContactUsHeading().getText();
		System.out.println(" ' The text of contact us  Heading is  :- " + tString);
		boolean verifyHeadingBlock = nrp.getContactUsHeadingBlock().isDisplayed();
		System.out
				.println(" ' Text is display under Contact Us Heading'  in contact us page,  expected :-True/False :- "
						+ verifyHeadingBlock);
		String txString = nrp.getContactUsHeadingBlock().getText();
		System.out.println(" ' The text  under contact us Heading is    :- " + txString);

		boolean verifyContactUsSubSection = nrp.getGobalMeadiaContact().isDisplayed();
		System.out.println(" 'Contact Us Sub Section' is Display  under contact us page,  expected :-True/False :- "
				+ verifyContactUsSubSection);
		String tsString = nrp.getGobalMeadiaContact().getText();
		System.out.println(" ' The text  under media contact us is    :- " + tsString);
	}
}