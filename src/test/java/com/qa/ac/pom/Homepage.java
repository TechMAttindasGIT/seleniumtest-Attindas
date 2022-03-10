package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ac.generic.BaseClass;

public class Homepage extends BaseClass {

	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle'])[1]")
	public WebElement ourcompany;

	@FindBy(xpath = "//a[.='Our Brands']")
	public WebElement ourbrand;

	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle'])[2]")
	public WebElement ourproduct;
	@FindBy(xpath = "//ul[@class='ms-auto list-group list-group-horizontal']//a[contains(text(),'Contact Us')]")
	public WebElement contactus;
	@FindBy(xpath = "//ul[@class='ms-auto list-group list-group-horizontal']//a[contains(text(),'Newsroom')]")
	public WebElement newsroom;
	@FindBy(xpath = "//h3[@class='footerNavHeading']//a[contains(text(),'Contact Us')]")
	public WebElement contactUs;
	@FindBy(xpath = "(//a[@class='nav-link'][normalize-space()='Sustainability'])[1]")
	public WebElement Sustainability;
	@FindBy(xpath = "(//a[normalize-space()='Login/Register'])[1]")
	public WebElement register;
	@FindBy(xpath = "(//a[@class='nav-link'][normalize-space()='Careers'])[1]")
	public WebElement Careers;

	public WebElement getCareers() {
		return Careers;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getSustainability() {
		return Sustainability;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getNewsroom() {
		return newsroom;
	}

	public WebElement getOurproduct() {
		return ourproduct;
	}

	public WebElement getOurbrand() {
		return ourbrand;
	}

	public WebElement getOurcompany() {
		return ourcompany;
	}

	public String actualTitle(WebDriver driver) {
		driver.getCurrentUrl();
		driver.navigate().refresh();
		String title = driver.getTitle();
		return title;
	}

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
