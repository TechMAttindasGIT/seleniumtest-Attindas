package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurProductPom;

public class ProductBabyCare extends BaseClass {
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
		WebElement Babycare = ProductPom.getBabyCare();
		jExecutor.executeScript("arguments[0].click();", Babycare);
		Thread.sleep(2000);
		String baby = driver.getTitle();
		System.out
				.println("'In Produts ' 'Baby Care' sub category is displaying fine and Title of page is :-  " + baby);
		Thread.sleep(2500);
		boolean diapers = ProductPom.getBabyDiapers().isDisplayed();
		System.out.println("'In Baby Care ' 'Baby Diapers ' is present,it return True/False -> " + diapers);
		boolean TrainingPants = ProductPom.getTrainingPants().isDisplayed();
		System.out.println("'In Baby Care ' 'Training Pants ' is present,it return True/False -> " + TrainingPants);
		boolean youthPants = ProductPom.getYouthPant().isDisplayed();
		System.out.println("'In Baby Care ' 'Youth Pants ' is present,it return True/False -> " + youthPants);
		boolean changeMates = ProductPom.getChangeMates().isDisplayed();
		System.out.println("'In Baby Care ' 'Change Mates ' is present,it return True/False -> " + changeMates);
	}
}