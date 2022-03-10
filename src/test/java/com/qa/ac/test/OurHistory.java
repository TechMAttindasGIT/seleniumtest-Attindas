package com.qa.ac.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.OurCompanyPom;

public class OurHistory extends BaseClass {
	@Test
	public void verifyTitle() throws InterruptedException, IOException {
		Homepage hp = new Homepage(driver);
		hp.ourcompany.click();
		OurCompanyPom oc = new OurCompanyPom(driver);
		oc.getOurHistory().click();

		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("OHtitle");
		Thread.sleep(2000);
		String actualTitle = oc.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
