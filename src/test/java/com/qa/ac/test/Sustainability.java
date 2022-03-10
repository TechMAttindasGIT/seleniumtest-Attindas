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
import com.qa.ac.pom.SustainabilityPom;

public class Sustainability extends BaseClass {

	@Test
	public void sustainability() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		boolean contact = h.getSustainability().isDisplayed();
		if (contact == true) {
			String text = h.getSustainability().getText();
			System.out.println(
					"'In Home Page ' 'Sustainability', in Header Section is displaying fine  and text of  Header Section is :- "
							+ text);
		} else {
			System.out.println("Sustainability  in Header Section is not present");
		}
		WebElement nElement = h.getSustainability();
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(2500);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("Stitle");
		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of  Sustainability page is match,actualTitle is equal to expectedTitle  ");
		SustainabilityPom sPom = new SustainabilityPom(driver);

		boolean verifyImage = sPom.getNewsImage().isDisplayed();
		System.out.println(
				" 'Banner Image' is Displaying in Sustainability page,  expected :-True/False :- " + verifyImage);

		boolean verifyHeading = sPom.getHeading().isDisplayed();
		System.out
				.println(" 'Heading' is Displaying in Sustainability page,  expected :-True/False :- " + verifyHeading);
		String tString = sPom.getHeading().getText();
		System.out.println(" ' The text of Sustainability Heading is  :- " + tString);

		boolean verifyHeadingBlock = sPom.getHeadingBlock().isDisplayed();
		System.out.println(
				" ' Under Sustainability Heading' texts are Displaying in Sustainability  page,  expected :-True/False :- "
						+ verifyHeadingBlock);
		String thString = sPom.getHeadingBlock().getText();
		System.out.println(" ' The text inside heading is  :- " + thString);

		boolean verifyContainer = sPom.getContainer().isDisplayed();
		System.out.println(
				" ' Container' is Displaying in Sustainabilit  page,  expected :-True/False :- " + verifyContainer);
		String tcString = sPom.getContainer().getText();
		System.out.println(" ' The text of Container is   :- " + tcString);

		boolean verifysubHeading = sPom.getSubHeading().isDisplayed();
		System.out.println(
				" 'Sub Heading' is Displaying in Sustainability  page,  expected :-True/False :- " + verifysubHeading);
		String tsString = sPom.getSubHeading().getText();
		System.out.println(" ' The text of  Sub Heading is  :- " + tsString);

		boolean verifyLogo = sPom.getSubHeading().isDisplayed();
		System.out.println(" 'Logo' is Displaying in Sustainability  page,  expected :-True/False :- " + verifyLogo);
		String tlString = sPom.getLogo().getAttribute("data-element");
		System.out.println(" ' The text on Logo is  :- " + tlString);

		boolean verifyDescription = sPom.getTextUnderSubHeading().isDisplayed();
		System.out.println(
				" 'Description' is Displaying under SubHeading, Sustainability  page,  expected :-True/False :- "
						+ verifyDescription);
		String txString = sPom.getTextUnderSubHeading().getText();
		System.out.println(" ' The text Descripiton Under Sub Heading is  :- " + txString);

		boolean verifyImage2nd = sPom.getNewsImage().isDisplayed();
		System.out.println(
				" 'Second Image' is Displaying  beside Our Environmental in Sustainability page,  expected :-True/False :- "
						+ verifyImage2nd);

		boolean verifyEsubHeading = sPom.getESubHeading().isDisplayed();
		System.out.println(
				" ' Secound Sub Heading' is Displaying beside Our Environmental in Sustainability  page,  expected :-True/False :- "
						+ verifyEsubHeading);
		String teString = sPom.getSubHeading().getText();
		System.out.println(" ' The text of  Sub Heading is  :- " + teString);

		boolean verifyLearnMore = sPom.getLearnMore().isDisplayed();
		System.out.println(
				" 'Learn more ' Link is Displaying under Our Environmental in Sustainability  page,  expected :-True/False :- "
						+ verifyLearnMore);
		String tlmString = sPom.getLearnMore().getText();
		System.out.println(" ' The text of  link is  :- " + tlmString);
		WebElement LElement = sPom.getLearnMore();
		jExecutor.executeScript("arguments[0].click();", LElement);
		Thread.sleep(2500);
		String text = driver.getTitle();
		String text1 = "Respecting Our Planet | Attends";
		if (text.equals(text1)) {
			System.out.println("Title is matched and title of page is :- " + text);

		} else {
			System.out.println("Title is  not matched" + text);
		}
		Thread.sleep(2000);
		boolean Image = sPom.getRespectOurPlanetImage().isDisplayed();
		if (Image == true) {

			System.out.println(
					"'Respecting Our Planet' page 'Image ' is Displaying in Header Section,expected :-True/False :- "
							+ Image);
		} else {
			System.out.println("Image is not displaying");
		}
		boolean verifyRContainer = sPom.getRespectOurPlanetContainer().isDisplayed();
		System.out.println(" ' Container' is Displaying in Respecting Our Planet page,  expected :-True/False :- "
				+ verifyRContainer);
		String trString = sPom.getRespectOurPlanetContainer().getText();
		System.out.println(" ' The text of Container is   :- " + trString);

		boolean verifyHeadingE = sPom.getRespectOurPlanetHeading().isDisplayed();
		System.out.println(
				" 'Heading' is Displaying in Respecting Our Planet page,  expected :-True/False :- " + verifyHeadingE);
		String tbString = sPom.getRespectOurPlanetHeading().getText();
		System.out.println(" ' The text of Heading is   :- " + tbString);

		boolean verifyHeadingw = sPom.getRespectOurPlanetHeadingSec().isDisplayed();
		System.out.println(" ' Secound Heading' is Displaying in Respecting Our Planet page,  expected :-True/False :- "
				+ verifyHeadingw);
		String toString = sPom.getRespectOurPlanetHeadingSec().getText();
		System.out.println(" ' The text of Secound Heading is   :- " + toString);

		boolean verifyHeadingz = sPom.getRespectOurPlanetContainerth().isDisplayed();
		System.out.println(" 'Third Heading' is Displaying in Respecting Our Planet page,  expected :-True/False :- "
				+ verifyHeadingz);
		String tqString = sPom.getRespectOurPlanetContainerth().getText();
		System.out.println(" ' The text of Third Heading is   :- " + tqString);
		driver.navigate().back();

		boolean sImage = sPom.getSocailImage().isDisplayed();
		if (sImage == true) {

			System.out.println(
					"'In Our Planet' page 'Image ' is Displaying beside Our Social Responsibilities Section,expected :-True/False :- "
							+ Image);
		} else {
			System.out.println("Image is not displaying");

		}

		boolean verifySocial = sPom.getSocailResponsibility().isDisplayed();
		System.out.println(
				" 'Our Social Responsibilities' Heading is Displaying in Respecting Our Planet page,  expected :-True/False :- "
						+ verifySocial);
		String tqString1 = sPom.getSocailResponsibility().getText();
		System.out.println(" ' The text of Heading is   :- " + tqString1);
		String tlsString = sPom.getSocailLearnMore().getText();
		System.out.println(" ' The text of  link for Our Social Responsibilities   :- " + tlsString);

		WebElement sElement = sPom.getSocailLearnMore();
		jExecutor.executeScript("arguments[0].click();", sElement);
		Thread.sleep(2500);
		String texts = driver.getTitle();
		String texts1 = "Nurturing Our Communities | Attends";
		if (texts.equals(texts1)) {
			System.out.println("Title is matched and title of page is for Our Social Responsibilities :- " + texts);

		} else {
			System.out.println("Title is  not matched" + texts);
		}
		driver.navigate().back();
		Thread.sleep(2500);
		boolean gImage = sPom.getGovernanceImage().isDisplayed();
		if (gImage == true) {

			System.out.println(
					"' In Our Planet' page 'Image ' is Displaying beside Our Governance Commitment Section,expected :-True/False :- "
							+ gImage);
		} else {
			System.out.println("Image is not displaying");

		}
		Thread.sleep(2500);
		boolean verifyGovernance = sPom.getGovernanceCommitment().isDisplayed();
		System.out.println(
				" 'Our Governance Commitment' Heading is Displaying in Respecting Our Planet page,  expected :-True/False :- "
						+ verifyGovernance);
		String tgString1 = sPom.getGovernanceCommitment().getText();
		System.out.println(" ' The text of Heading for Governance Commitment is  :- " + tgString1);
		String tlgString = sPom.getGovernanceLearnMore().getText();
		System.out.println(" ' The text of link for Our Governance Commitment   :- " + tlgString);

		WebElement gElement = sPom.getGovernanceLearnMore();
		jExecutor.executeScript("arguments[0].click();", gElement);
		Thread.sleep(2500);
		String textg = driver.getTitle();
		String textg1 = "Corporate Governance Page | Attends";
		if (textg.equals(textg1)) {
			System.out.println("Title is matched and title of page is for Governance Commitment page :- " + textg);

		} else {
			System.out.println("Title is  not matched " + textg);
		}
		driver.navigate().back();
		Thread.sleep(2500);
	}
}