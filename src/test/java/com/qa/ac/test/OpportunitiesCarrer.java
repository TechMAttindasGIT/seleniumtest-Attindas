package com.qa.ac.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.CareersPom;
import com.qa.ac.pom.Homepage;

public class OpportunitiesCarrer extends BaseClass {
	@Test
	public void careers() throws InterruptedException, IOException {

		Homepage h = new Homepage(driver);
		h.getCareers().click();

		CareersPom cp = new CareersPom(driver);
		boolean heading = cp.getHeadingAll().isDisplayed();
		if (heading == true) {

			System.out.println(
					"'Heading'  is displaying fine  Under Sub Section of 'Carrer Page' expected :-True/False :- "
							+ heading + " And text of heading is :- " + cp.getHeadingAll().getText());

		} else {
			System.out.println("'Heading '  Sub Section  is not present");
		}

		List<WebElement> element = driver.findElements(By.xpath("(//div[@class='imgParentSection'])"));
		System.out.println(" Total number of Sub section in  Opportunities for All " + element.size());
		int total = element.size();
		for (int i = 0; i < total; i++) {
			WebElement element2 = element.get(i);
			boolean all = element2.isDisplayed();
			if (all == true) {
				System.out.println("Subsection is displaying fine in career page  expected :-True/False " + all);
			}

			String text = element2.getText();
			System.out.println("" + text);
		}

	}
}