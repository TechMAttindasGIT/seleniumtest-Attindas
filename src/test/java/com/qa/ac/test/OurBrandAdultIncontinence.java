package com.qa.ac.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurBrandPom;

public class OurBrandAdultIncontinence extends BaseClass {

	@Test
	public void ourBrandAdult() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homepage h = new Homepage(driver);
		h.ourbrand.click();
		OurBrandPom brandPom = new OurBrandPom(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement adult = brandPom.getAdult();
		jExecutor.executeScript("arguments[0].click();", adult);
		Thread.sleep(2000);
		System.out.println("Title of page is " + driver.getTitle());
		java.util.List<WebElement> ListDatsa = driver
				.findElements(By.xpath("//*[@id='maincontent']/div[2]/div/div[3]/div/div/div/div/div/a/img"));
		System.out.println("Total number of web element under Adult Incontinence  is  :- " + ListDatsa.size()
				+ "  and their store data  are given below :- ");
		System.out.println(" ");
		for (WebElement webElement : ListDatsa) {
			String text = webElement.getAttribute("alt");
			System.out.println(text);
		}
		Thread.sleep(2000);
		WebElement Reassure = brandPom.getReassure();
		jExecutor.executeScript("arguments[0].click();", Reassure);
		Set<String> windowhandler = driver.getWindowHandles();
		Iterator<String> iter = windowhandler.iterator();
		String parentwindowr = iter.next();
		String childwindowr = iter.next();
		driver.switchTo().window(childwindowr);
		String Reassures = driver.getTitle();
		System.out
				.println("'In Adult Incontinence ' 'Reassure' sub category is displaying fine and Title of page is :-  "
						+ Reassures);
		driver.close();
		driver.switchTo().window(parentwindowr);

		WebElement indasec = brandPom.getIndasec();
		jExecutor.executeScript("arguments[0].click();", indasec);
		Thread.sleep(4000);
		Set<String> windowhandlein = driver.getWindowHandles();
		Iterator<String> iterin = windowhandlein.iterator();
		String parentwindowin = iterin.next();
		String childwindowin = iterin.next();
		driver.switchTo().window(childwindowin);
		String indasect = driver.getTitle();
		System.out
				.println("'In Adult Incontinence ' 'Indasec' sub category is displaying fine and Title of page is :-  "
						+ indasect);
		driver.close();
		driver.switchTo().window(parentwindowin);
		WebElement attends = brandPom.getAttends();
		jExecutor.executeScript("arguments[0].click();", attends);
		String attend = driver.getTitle();
		System.out.println(
				"'In Adult Incontinence ' 'Attends' sub category is displaying fine and Title of page is :-" + attend);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement indaslip = brandPom.getIndaslip();
		jExecutor.executeScript("arguments[0].click();", indaslip);
		Thread.sleep(2000);
		String inda = driver.getTitle();
		System.out.println(
				"'In Adult Incontinence ' 'Indaslip' sub category is displaying fine and Title of page is :-" + inda);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement inopack = brandPom.getIncopack();
		jExecutor.executeScript("arguments[0].click();", inopack);
		Thread.sleep(2000);
		String ino = driver.getTitle();
		System.out.println(
				"'In Adult Incontinence' 'Incopack' sub category is displaying fine and Title of page is :-" + ino);
		driver.navigate().back();
		WebElement sabaninds = brandPom.getSabanindas();
		jExecutor.executeScript("arguments[0].click();", sabaninds);

		String indb = driver.getTitle();
		System.out.println(
				"'In Adult Incontinence ' 'Sabanindas' sub category is displaying fine and Title of page is :-" + indb);
		Thread.sleep(2000);
		driver.navigate().back();

	}
}
