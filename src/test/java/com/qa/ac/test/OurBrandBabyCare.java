package com.qa.ac.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurBrandPom;

public class OurBrandBabyCare extends BaseClass {
	@Test
	public void ourBrandBabyCare() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homepage h = new Homepage(driver);
		h.ourbrand.click();
		OurBrandPom brandPom = new OurBrandPom(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement babycare = brandPom.getBabycare();
		jExecutor.executeScript("arguments[0].click();", babycare);
		System.out.println("Title of page is" + driver.getTitle());

		WebElement comfees = brandPom.getComfees();
		jExecutor.executeScript("arguments[0].click();", comfees);
		Set<String> windowhandle = driver.getWindowHandles();
		Iterator<String> iterators = windowhandle.iterator();
		String parentwindows = iterators.next();
		String childwindows = iterators.next();
		driver.switchTo().window(childwindows);
		String comfee = driver.getTitle();
		System.out.println(
				"'In Baby Care ' 'Comfees' sub category is displaying fine and Title of page is :-  " + comfee);
		driver.close();
		driver.switchTo().window(parentwindows);

		WebElement chelino = brandPom.getChelino();
		jExecutor.executeScript("arguments[0].click();", chelino);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);
		String chelinos = driver.getTitle();
		System.out.println(
				"'In Baby Care ' 'Chelino' sub category is displaying fine and Title of page is :-  " + chelinos);
		driver.close();
		driver.switchTo().window(parentwindow);

	}
}