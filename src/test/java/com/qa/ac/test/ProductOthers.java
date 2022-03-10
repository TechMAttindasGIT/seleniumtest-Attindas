package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurProductPom;

public class ProductOthers extends BaseClass {
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
		WebElement other = ProductPom.getOthers();
		jExecutor.executeScript("arguments[0].click();", other);
		Thread.sleep(2500);

		String oth = driver.getTitle();
		System.out.println("'In Produts ' 'Others' sub category is displaying fine and Title of page is :-  " + oth);

		boolean AfterBirth = ProductPom.getAfterBirthSpecialtyAids().isDisplayed();
		System.out.println("'In Others 'AfterBirthSpecialtyAids' is present,it return True/False -> " + AfterBirth);
		boolean ProfessionalCare = ProductPom.getProfessionalCare().isDisplayed();
		System.out
				.println("'In Others 'AfterBirthSpecialtyAids' is present,it return True/False -> " + ProfessionalCare);
	}
}