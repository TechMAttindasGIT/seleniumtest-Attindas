package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurProductPom;

public class OurProducts extends BaseClass {
	@Test
	public void Ourproducts() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Homepage h = new Homepage(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement op = h.getOurproduct();
		jExecutor.executeScript("arguments[0].click();", op);

		OurProductPom ProductPom = new OurProductPom(driver);

		if (ProductPom.getProduct().isDisplayed()) {
			System.out.println("Bordered Heading is displaying " + ProductPom.getProduct().getText());
			String fonttxtAlign = ProductPom.getProduct().getCssValue("text-align");
			System.out.println("Font Text Alignment -> " + fonttxtAlign);
			System.out.println("location of Bordered Heading " + ProductPom.getProduct().getLocation());
		} else {
			System.out.println("Bordered Heading is  not displaying as well nor Clickable ");
		}
		Thread.sleep(2000);
		boolean img = ProductPom.getImage().isDisplayed();
		System.out.println("if Image is present on product page it returns True/ False -> " + img);
		//commented by AT 4/5
		/*boolean text = driver
				.findElement(By.xpath("//p[contains(text(),'From the research laboratory to the retail shelf,')]"))
				.isDisplayed();
		if (text == true) {
			String text1 = driver
					.findElement(By.xpath("//p[contains(text(),'From the research laboratory to the retail shelf,')]"))
					.getText();
			System.out.println("Text is present besides image in our product page it return true/false :-" + text
					+ " and text are :- " + text1);
		} else {
			System.out.println("Text is not present in our products page");
		}*/

		/*ExpTitle e = new ExpTitle(); //commented by AT 4/5
		String expectedTitle = e.getExpTitle("pptitle");
		driver.navigate().refresh();
		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of our Brand page is match actualTitle is equal to expectedTitle ");*/
	}
}