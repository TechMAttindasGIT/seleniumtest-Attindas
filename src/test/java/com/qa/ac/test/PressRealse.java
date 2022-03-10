package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.NewsroomPom;

public class PressRealse extends BaseClass {
	@Test
	public void pressRealse() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Homepage h = new Homepage(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		WebElement nElement = h.getNewsroom();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(2500);
		NewsroomPom nrp = new NewsroomPom(driver);
		boolean verifyPressReleaseHeading = nrp.getPressrelease().isDisplayed();
		System.out.println(" ' Press Release Heading' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyPressReleaseHeading);
		boolean verifyPressRelease = nrp.getPressRealese().isDisplayed();
		System.out.println(
				" ' Press Release' is Displaying in newsroom page,  expected :-True/False :- " + verifyPressRelease);
		WebElement pElement = nrp.getPressRealese();
		jExecutor.executeScript("arguments[0].click();", pElement);
		Thread.sleep(2000);
		String pString = driver.getTitle();
		if (pString.contains("American Industrial Partners Completes Acquisition of Domtar Personal Care")) {

			System.out.println(" 'Title is matched' " + pString);
		} else {
			System.out.println("Page title does not match ");
		}
		driver.navigate().back();
		Thread.sleep(2500);
		boolean verifyWeeklyPressRelease2 = nrp.getWeeklyPressRealese2().isDisplayed();

		System.out.println(" '  Weekly Press Release 2' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyWeeklyPressRelease2);

		WebElement wpElement = nrp.getWeeklyPressRealese2();
		jExecutor.executeScript("arguments[0].click();", wpElement);
		Thread.sleep(2500);
		String weeklypress2 = driver.getTitle();
		if (pString.contains("Weekly Press Release 2")) {

			System.out.println(" 'Title is matched' " + weeklypress2);
		} else {
			System.out.println("Page title does not match ");
		}
		driver.navigate().back();
		Thread.sleep(2500);
		boolean verifyWeekPressRelease3 = nrp.getWeeklyPressRealese3().isDisplayed();
		System.out.println(" 'Weekly Press Release 3' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyWeekPressRelease3);

		WebElement wpElement3 = nrp.getWeeklyPressRealese3();
		jExecutor.executeScript("arguments[0].click();", wpElement3);
		Thread.sleep(2500);
		String weeklypress3 = driver.getTitle();
		if (pString.contains("Weekly Press Release 3")) {

			System.out.println(" 'Title is matched' " + weeklypress3);
		} else {
			System.out.println("Page title does not match ");
		}
		driver.navigate().back();
		Thread.sleep(2500);
		boolean verifyPressAllRelase = nrp.getViewAllPressNewsLink().isDisplayed();
		System.out.println(" '  View All Press Release' is Displaying in newsroom page,  expected :-True/False :- "
				+ verifyPressAllRelase);
		WebElement pressAllRelase = nrp.getWeeklyPressRealese3();
		jExecutor.executeScript("arguments[0].click();", pressAllRelase);
		Thread.sleep(2500);
		String PressAllRe = driver.getTitle();
		System.out.println(PressAllRe);
	}
}