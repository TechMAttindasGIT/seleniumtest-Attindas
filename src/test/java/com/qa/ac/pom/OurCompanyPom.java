package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurCompanyPom {

	public OurCompanyPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'Our Business')]")
	private WebElement ourBusiness;

	@FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'Our Presence')]")
	private WebElement ourPresence;

	@FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'Making it Personal')]")
	private WebElement makingItPersonal;

	@FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'Our Leaders')]")
	private WebElement ourLeaders;

	@FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'Our Portfolio Companies')]")
	private WebElement ourPortfolio;

	@FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'Our History')]")
	private WebElement ourHistory;
	@FindBy(xpath = "//*[@id='navbarNavDropdown']/ul/li[1]/div/div/div/div[2]/div/img")
	private WebElement OcImage;

	public WebElement getOcImage() {
		return OcImage;
	}

	public WebElement getOurHistory() {
		return ourHistory;
	}

	public WebElement getOurBusiness() {
		return ourBusiness;
	}

	public WebElement getOurPresence() {
		return ourPresence;
	}

	public WebElement getMakingItPersonal() {
		return makingItPersonal;
	}

	public WebElement getOurLeaders() {
		return ourLeaders;
	}

	public WebElement getOurPortfolio() {
		return ourPortfolio;
	}

	public String actualTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
}
