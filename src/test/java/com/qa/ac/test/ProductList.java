package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurProductPom;

public class ProductList extends BaseClass {
	@Test
	public void Ourproducts() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement op = h.getOurproduct();
		jExecutor.executeScript("arguments[0].click();", op);
		Thread.sleep(2500);
		OurProductPom ProductPom = new OurProductPom(driver);

		boolean adult = ProductPom.getAdult().isDisplayed();
		if (adult == true) {
			String text = ProductPom.getAdult().getText();
			System.out.println("'In Produts ' 'Adult Incontinence' sub category is displaying fine" + text);
		} else {
			System.out.println("Adult is not present");
		}
		boolean Babycare = ProductPom.getBabyCare().isDisplayed();
		if (Babycare == true) {
			String text1 = ProductPom.getBabyCare().getText();
			System.out.println("'In Produts ' 'Baby Care ' sub category is displaying fine" + text1);
		} else {
			System.out.println("Baby Case is not present");
		}

		boolean other = ProductPom.getOthers().isDisplayed();
		if (other == true) {
			String text2 = ProductPom.getOthers().getText();
			System.out.println("'In Produts ' 'Others' sub category is displaying fine" + text2);
		} else {
			System.out.println("other is not present");
		}
		boolean clinical = ProductPom.getClinical().isDisplayed();
		if (clinical == true) {
			String text3 = ProductPom.getClinical().getText();
			System.out.println("'In Produts ' 'Clinical' sub category is displaying fine" + text3);
		} else {
			System.out.println("Clinical is not present");
		}
	}
}