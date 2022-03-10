package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.ContactUsPom;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.NewsroomPom;

import corporate.utilites.XLUtility;

public class SignUpForContactUs extends BaseClass {
	@Test(dataProvider = "SignUp")

	public void signUp(String firstName, String lastName, String email, String phoneNumber, String password,
			String houseno, String exp) throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		Homepage h = new Homepage(driver);
		WebElement nElement = h.contactUs;
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(3000);
		NewsroomPom nrp = new NewsroomPom(driver);
		Thread.sleep(1500);
		WebElement textFirstName = nrp.getFirstName();
		textFirstName.clear();
		textFirstName.sendKeys(firstName);
		Thread.sleep(1500);
		WebElement textlastName = nrp.getMlastName();
		textlastName.clear();
		textlastName.sendKeys(lastName);
		Thread.sleep(1500);
		WebElement textemail = nrp.getEmail();
		textemail.clear();
		textemail.sendKeys(email);
		Thread.sleep(1500);
		WebElement textphones = nrp.getPhoneNumber();
		textphones.clear();
		textphones.sendKeys(phoneNumber);
		Thread.sleep(1500);
		ContactUsPom cup = new ContactUsPom(driver);
		Thread.sleep(8000);
		By type = By.id("type_of_enquiry");
		Select select1 = new Select(driver.findElement(type));
		select1.selectByIndex(1);
		Thread.sleep(8000);
		By country = By.id("country");
		Select select = new Select(driver.findElement(country));
		select.selectByIndex(5);
		Thread.sleep(1500);
		WebElement writeRequest = cup.getWriteRequest();
		writeRequest.sendKeys(
				"Hi Attindas, I Pranav Prakash , I am Automating this page for testing your website  and Can you verify the web Element is working fine or not ");
		Thread.sleep(2500);
	}

	@DataProvider(name = "SignUp")
	public String[][] getData() throws IOException {

		String path = ".\\TestData\\Data.xlsx";

		XLUtility xlutil = new XLUtility(path);
		int totalRows = xlutil.getRowCount("Sheet1");
		int totalCols = xlutil.getCellCount("Sheet1", 1);
		String SignUp[][] = new String[totalRows][totalCols];
		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				SignUp[i - 1][j] = xlutil.getCellData("Sheet1", i, j);
			}
		}

		return SignUp;
	}
}
