package com.qa.ac.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.pom.Homepage;
import com.qa.ac.pom.NewsroomPom;

import corporate.utilites.XLUtility;

public class SignUpForNews extends BaseClass {
	@Test(dataProvider = "SignUp")
	public void signUp(String firstName, String lastName, String email, String phoneNumber, String password,
			String houseno, String exp) throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		Homepage h = new Homepage(driver);
		WebElement nElement = h.getNewsroom();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(2500);
		NewsroomPom nrp = new NewsroomPom(driver);
		WebElement signup = nrp.getSignupForNews();
		jExecutor.executeScript("arguments[0].click();", signup);
		Thread.sleep(3000);
		WebElement textFirstName = nrp.getFirstName();
		textFirstName.clear();
		textFirstName.sendKeys(firstName);

		WebElement textlastName = nrp.getLastName();
		textlastName.clear();
		textlastName.sendKeys(lastName);

		WebElement textemail = nrp.getEmail();
		textemail.clear();
		textemail.sendKeys(email);

		WebElement textphones = nrp.getPhoneNumber();
		textphones.clear();
		textphones.sendKeys(phoneNumber);

		WebElement frame = nrp.getFrame();
		driver.switchTo().frame(frame);
		WebElement captcha = nrp.getRecaptcha();
		jExecutor.executeScript("arguments[0].click();", captcha);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement subscribed = nrp.getSubscribed();
		subscribed.click();

		WebElement terms = nrp.getTermsCondition();
		terms.click();

		WebElement bsubscribed = nrp.getSubscribedButton();
		bsubscribed.click();

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