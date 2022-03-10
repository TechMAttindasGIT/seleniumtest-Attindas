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

public class OurBrandCategoryAll extends BaseClass {
	@Test
	public void ourBrandCategory() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Homepage h = new Homepage(driver);
		h.ourbrand.click();
		Thread.sleep(2500);
		OurBrandPom brandPom = new OurBrandPom(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement all = brandPom.getAll();
		jExecutor.executeScript("arguments[0].click();", all);
		Thread.sleep(2500);
		WebElement chelino = brandPom.getChelino();
		jExecutor.executeScript("arguments[0].click();", chelino);
		Thread.sleep(4000);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);
		String chelinos = driver.getTitle();
		System.out.println("'In All ' 'Chelino' sub category is displaying fine and Title of page is :-  " + chelinos);
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(2500);
		WebElement comfees = brandPom.getComfees();
		jExecutor.executeScript("arguments[0].click();", comfees);
		Thread.sleep(2500);
		Set<String> windowhandle = driver.getWindowHandles();
		Iterator<String> iterators = windowhandle.iterator();
		String parentwindows = iterators.next();
		String childwindows = iterators.next();
		driver.switchTo().window(childwindows);
		String comfee = driver.getTitle();
		System.out.println("'In All ' 'Comfees' sub category is displaying fine and Title of page is :-  " + comfee);
		driver.close();
		driver.switchTo().window(parentwindows);
		Thread.sleep(2500);
		WebElement Reassure = brandPom.getReassure();
		jExecutor.executeScript("arguments[0].click();", Reassure);
		Thread.sleep(2500);
		Set<String> windowhandler = driver.getWindowHandles();
		Iterator<String> iter = windowhandler.iterator();
		String parentwindowr = iter.next();
		String childwindowr = iter.next();
		driver.switchTo().window(childwindowr);
		String Reassures = driver.getTitle();
		System.out
				.println("'In All ' 'Reassure' sub category is displaying fine and Title of page is :-  " + Reassures);
		driver.close();
		driver.switchTo().window(parentwindowr);
		Thread.sleep(2500);
		WebElement indas = brandPom.getIndas();
		jExecutor.executeScript("arguments[0].click();", indas);
		Thread.sleep(2500);
		Set<String> windowhandlei = driver.getWindowHandles();
		Iterator<String> iteri = windowhandlei.iterator();
		String parentwindowi = iteri.next();
		String childwindowi = iteri.next();
		driver.switchTo().window(childwindowi);
		String indast = driver.getTitle();
		System.out.println("'In All ' 'Indas' sub category is displaying fine and Title of page is :-  " + indast);
		driver.close();
		driver.switchTo().window(parentwindowi);
		Thread.sleep(2500);
		WebElement indasec = brandPom.getIndasec();
		jExecutor.executeScript("arguments[0].click();", indasec);
		Thread.sleep(2500);
		Set<String> windowhandlein = driver.getWindowHandles();
		Iterator<String> iterin = windowhandlein.iterator();
		String parentwindowin = iterin.next();
		String childwindowin = iterin.next();
		driver.switchTo().window(childwindowin);
		String indasect = driver.getTitle();
		System.out.println("'In All ' 'Indasec' sub category is displaying fine and Title of page is :-  " + indasect);
		driver.close();
		driver.switchTo().window(parentwindowin);
		Thread.sleep(2500);
		WebElement attends = brandPom.getAttends();
		jExecutor.executeScript("arguments[0].click();", attends);
		Thread.sleep(2500);
		String attend = driver.getTitle();
		System.out.println("'In All ' 'Attends' sub category is displaying fine and Title of page is :-" + attend);
		driver.navigate().back();
		Thread.sleep(2500);

		WebElement inopack = brandPom.getIncopack();
		jExecutor.executeScript("arguments[0].click();", inopack);
		Thread.sleep(2500);
		String ino = driver.getTitle();
		System.out.println("'In All ' 'Incopack' sub category is displaying fine and Title of page is :-" + ino);
		driver.navigate().back();
		Thread.sleep(3000);

		WebElement sabaninds = brandPom.getSabanindas();
		jExecutor.executeScript("arguments[0].click();", sabaninds);
		Thread.sleep(2500);
		String indb = driver.getTitle();
		System.out.println("'In All ' 'Sabanindas' sub category is displaying fine and Title of page is :-" + indb);
		driver.navigate().back();
		Thread.sleep(2500);

		WebElement Addermis = brandPom.getAddermis();
		jExecutor.executeScript("arguments[0].click();", Addermis);
		Thread.sleep(2500);
		String indmis = driver.getTitle();
		System.out.println("'In All ' 'Addermis' sub category is displaying fine and Title of page is :-" + indmis);
		driver.navigate().back();
		Thread.sleep(2500);

	}
}
