package com.qa.ac.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurBrandPom;

public class OurBrandDisplay extends BaseClass {
	@Test
	public void ourBrandDisplay() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		h.ourbrand.click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		OurBrandPom brandPom = new OurBrandPom(driver);
		brandPom.getBrandlogo().click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		boolean verifylogo = brandPom.getBrandlogo().isDisplayed();
		System.out.println(" 'Brand Logo' are Displaying fine expected :-True/False :- " + verifylogo);
		Thread.sleep(2000);

		String fontSize = brandPom.getBrandlogo().getCssValue("font-size");
		System.out.println("Font Size -> " + fontSize);
		String fontColor = brandPom.getBrandlogo().getCssValue("color");
		System.out.println("Font Color -> " + fontColor);
		String fontFamily = brandPom.getBrandlogo().getCssValue("font-family");
		System.out.println("Font Family -> " + fontFamily);
		String fonttxtAlign = brandPom.getBrandlogo().getCssValue("text-align");
		System.out.println("Font Text Alignment -> " + fonttxtAlign);
		System.out.println("location of logo is -> " + brandPom.getBrandlogo().getLocation());

		driver.navigate().back();
		Thread.sleep(2000);
		String eString = "Enhancing Health, Dignity, and Comfort ";
		String aString = brandPom.getBorderHeading().getText();
		if (eString.equalsIgnoreCase(aString)) {
			System.out.println("Actual and expected results are same " + aString);
		} else {
			System.out.println("Actual and expected results are same " + aString);
		}

	}

}