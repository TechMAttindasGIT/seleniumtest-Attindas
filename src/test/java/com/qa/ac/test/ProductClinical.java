package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurProductPom;

public class ProductClinical extends BaseClass {

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
		WebElement Clinical = ProductPom.getClinical();
		jExecutor.executeScript("arguments[0].click();", Clinical);
		Thread.sleep(2500);
		String clinical = driver.getTitle();
		System.out.println(
				"'In Produts ' 'Clinical' sub category is displaying fine and Title of page is :-  " + clinical);

		boolean HydrophilicCottonProducts = ProductPom.getHydrophilicCottonProducts().isDisplayed();
		System.out.println("'In Clinical 'Hydrophilic Cotton Products' is present,it return True/False -> "
				+ HydrophilicCottonProducts);
		boolean SurgicalGownsAndDrapes = ProductPom.getSurgicalGownsandDrapes().isDisplayed();
		System.out.println("'In Clinical 'Surgical Gowns And Drapes' is present,it return True/False -> "
				+ SurgicalGownsAndDrapes);
	}
}