package com.qa.ac.test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurCompanyPom;

public class OurBusiness extends BaseClass {

	@Test
	public void verifyTitle() throws IOException, InterruptedException {
		Homepage hp = new Homepage(driver);
		hp.ourcompany.click();
		Thread.sleep(2000);
		OurCompanyPom oc = new OurCompanyPom(driver);
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		WebElement business = oc.getOurBusiness();
		jExecutor.executeScript("arguments[0].click();", business);
		Thread.sleep(2000);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("OBtitle");
		String actualTitle = oc.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);

	}

}
