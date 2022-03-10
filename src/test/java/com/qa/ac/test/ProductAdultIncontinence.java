package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurProductPom;

public class ProductAdultIncontinence extends BaseClass {

	@Test
	public void Ourproducts() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		Thread.sleep(2500);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement op = h.getOurproduct();
		jExecutor.executeScript("arguments[0].click();", op);
		Thread.sleep(2500);
		OurProductPom ProductPom = new OurProductPom(driver);
		WebElement adult = ProductPom.getAdult();
		jExecutor.executeScript("arguments[0].click();", adult);
		Thread.sleep(2500);
		String adults = driver.getTitle();
		System.out.println(
				"'In Produts ' 'Adult Incontinence' sub category is displaying fine and Title of page is -> " + adults);

		boolean borderHeading = ProductPom.getTypes().isDisplayed();
		System.out.println("If Border Heading is present it return True/False -> " + borderHeading);
		System.out.println(" Text of Border Heading is  -> " + ProductPom.getTypes().getText());
		String fonttxtAlign = ProductPom.getTypes().getCssValue("text-align");
		System.out.println("Font Text Alignment -> " + fonttxtAlign);
		boolean Disc = ProductPom.getDiscription().isDisplayed();
		System.out.println("Dscription about 'Types of Product' is present,it return True/False -> " + Disc);
		boolean liners = ProductPom.getLiners().isDisplayed();
		System.out.println("'In Adult Incontinence' 'Liners' is present,it return True/False -> " + liners);
		boolean pads = ProductPom.getPads_and_shields().isDisplayed();
		System.out.println("'In Adult Incontinence' 'Pads_and_shields' is present,it return True/False -> " + pads);
		boolean protective = ProductPom.getProtective_underwear_pants().isDisplayed();
		System.out.println(
				"'In Adult Incontinence' 'Protective_underwear_pant' is present,it return True/False -> " + protective);
		boolean Shaped = ProductPom.getShaped().isDisplayed();
		System.out.println("'In Adult Incontinence' 'Shaped' is present,it return True/False -> " + Shaped);
		boolean briefs = ProductPom.getBriefs().isDisplayed();
		System.out.println("'In Adult Incontinence' 'Briefs' is present,it return True/False -> " + briefs);
		boolean underpads = ProductPom.getUnderpads().isDisplayed();
		System.out.println("'In Adult Incontinence' 'Underpads' is present,it return True/False -> " + underpads);

	}
}