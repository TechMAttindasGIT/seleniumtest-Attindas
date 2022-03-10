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

public class OurBrandClinical extends BaseClass {

	@Test
	public void ourBrandClinical() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homepage h = new Homepage(driver);
		h.ourbrand.click();
		Thread.sleep(2000);
		OurBrandPom brandPom = new OurBrandPom(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement clinical = brandPom.getClinical();
		jExecutor.executeScript("arguments[0].click();", clinical);
		Thread.sleep(2000);
		System.out.println("Title of page is :- " + driver.getTitle());

		WebElement indas = brandPom.getIndas();
		jExecutor.executeScript("arguments[0].click();", indas);
		Thread.sleep(2000);
		Set<String> windowhandlei = driver.getWindowHandles();
		Iterator<String> iteri = windowhandlei.iterator();
		String parentwindowi = iteri.next();
		String childwindowi = iteri.next();
		driver.switchTo().window(childwindowi);
		String indast = driver.getTitle();
		System.out.println("'In Clinical' 'Indas' sub category is displaying fine and Title of page is :-  " + indast);
		driver.close();
		driver.switchTo().window(parentwindowi);
	}
}
