package com.qa.ac.test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.pom.ContactUsPom;
import com.qa.ac.pom.Homepage;

public class ContactUs extends BaseClass {
	@Test
	public void contactUs() throws InterruptedException, IOException {

		Homepage h = new Homepage(driver);
		boolean contact = h.getContactUs().isDisplayed();
		if (contact == true) {
			String text = h.getContactUs().getText();
			System.out.println(
					"'In Home Page ' 'Contact Us' sub category in Header Section is displaying fine  and text of sub Categoty is :- "
							+ text);
		} else {
			System.out.println("Contact US is not present");
		}
		WebElement nElement = h.getContactUs();
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(3000);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("ctitle");
		String actualTitle = h.actualTitle(driver);
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of  Contact Us page is match,actualTitle is equal to expectedTitle  ");
		ContactUsPom cup = new ContactUsPom(driver);

		boolean verifyImage = cup.getContactImage().isDisplayed();
		System.out
				.println(" 'Banner Image' is Displaying in contact Us page,  expected :-True/False :- " + verifyImage);

		boolean verifyHeading = cup.getContactHeading().isDisplayed();
		System.out.println(
				" 'Content US Heading' is Displaying in contact us  page,  expected :-True/False :- " + verifyHeading);
		String tString = cup.getContactHeading().getText();
		System.out.println(" ' The text of Contact Us Heading is  :- " + tString);

		boolean verifyHeadingBlock = cup.getContactHeadingBlock().isDisplayed();
		System.out.println(
				" ' Under Content US Heading' text are Displaying in contact us  page,  expected :-True/False :- "
						+ verifyHeadingBlock);
		String thString = cup.getContactHeadingBlock().getText();
		System.out.println(" ' The text inside heading is  :- " + thString);

		boolean verifysubHeading = cup.getContactSubHeading().isDisplayed();
		System.out.println(" 'Content US Sub Heading' is Displaying in contact us  page,  expected :-True/False :- "
				+ verifysubHeading);
		String tsString = cup.getContactSubHeading().getText();
		System.out.println(" ' The text of Contact us Sub Heading is  :- " + tsString);

		boolean verifyContainer = cup.getContainer().isDisplayed();
		System.out.println(
				" ' Container' is Displaying in contact us  page,  expected :-True/False :- " + verifyContainer);
		String tcString = cup.getContainer().getText();
		System.out.println(" ' The text of Container is   :- " + tcString);

		boolean verifyAdressNorthAmerica = cup.getAddress().isDisplayed();
		System.out.println(" ' North America' is Displaying in contact us  page,  expected :-True/False :- "
				+ verifyAdressNorthAmerica);
		String tNString = cup.getAddress().getText();
		System.out.println(" ' Heading of  1st address :- " + tNString);
		boolean verifyHQAdressNorthAmerica = cup.getHQAddressOfAmerica().isDisplayed();
		System.out.println(
				" ' HEADQUARTERS '  Address of North America is Displaying in contact us  page,  expected :-True/False :- "
						+ verifyHQAdressNorthAmerica);
		String tfString = cup.getHQAddressOfAmerica().getText();
		System.out.println(" ' HQ Address ' Of North America  is :- " + tfString);
		boolean verifyCOAdressNorthAmerica = cup.getCOAddressOfAmerica().isDisplayed();
		System.out.println(
				" ' COMMERCIAL OFFICES '  Address of North America  is Displaying in contact us  page,  expected :-True/False :- "
						+ verifyCOAdressNorthAmerica);
		String toString = cup.getCOAddressOfAmerica().getText();
		System.out.println(" ' COMMERCIAL OFFICES ' Address Of North America is  :- " + toString);
		boolean verifyMADFAdressNorthAmerica = cup.getMADFAddressOfAmerica().isDisplayed();
		System.out.println(
				" ' MANUFACTURING AND DISTRIBUTION FACILITIES ' Address of North America is Displaying in contact us  page,  expected :-True/False :- "
						+ verifyMADFAdressNorthAmerica);
		String tmString = cup.getMADFAddressOfAmerica().getText();
		System.out.println(" ' MANUFACTURING AND DISTRIBUTION FACILITIES 'Address Of North America is :- " + tmString);
		boolean verifyAdressEurope = cup.getSeconddAddres().isDisplayed();
		System.out.println(
				" 'Europe' is Displaying in contact us  page,  expected :-True/False :- " + verifyAdressEurope);
		String teString = cup.getSeconddAddres().getText();
		System.out.println(" ' Heading of  2nd address is :- " + teString);
		boolean verifyFullAdressEurope = cup.getFulldAddresOfEurope().isDisplayed();
		System.out.println(" ' Full Adress of Euirope ' is Displaying in contact us  page,  expected :-True/False :- "
				+ verifyFullAdressEurope);
		String tfeString = cup.getFulldAddresOfEurope().getText();
		System.out.println(" ' Full address of Europe  is :- " + tfeString);

	}
}