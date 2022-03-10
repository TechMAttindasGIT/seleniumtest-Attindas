package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPom {
	public ContactUsPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactHeading() {
		return ContactHeading;
	}

	public WebElement getContactHeadingBlock() {
		return ContactHeadingBlock;
	}

	public WebElement getContactSubHeading() {
		return ContactSubHeading;
	}

	@FindBy(xpath = "//div[@class='pagebuilder-overlay pagebuilder-poster-overlay']")
	private WebElement ContactImage;

	@FindBy(xpath = "//h1[contains(text(),'Question or comment?  We’re ready to help')]")
	private WebElement ContactHeading;
	@FindBy(xpath = "//div[@data-content-type='text']")
	private WebElement ContactHeadingBlock;
	@FindBy(xpath = "(//h2[@class='mt-5 text-center'][normalize-space()='Quick access to key contacts'])[2]")
	private WebElement ContactSubHeading;
	@FindBy(xpath = "//select[@title='Type of Enquiry']")
	private WebElement Enquiry;
	@FindBy(xpath = "//*[@id='country']")
	private WebElement country;
	@FindBy(xpath = "//textarea[@id='comment']")
	private WebElement WriteRequest;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='North America'])[2]")
	private WebElement Address;
	@FindBy(xpath = "//div[@class='container mt-3']")
	private WebElement Container;
	@FindBy(xpath = "//div[@class='contact-us']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]")
	private WebElement HQAddressOfAmerica;
	@FindBy(xpath = "//div[@class='page-wrapper']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]")
	private WebElement COAddressOfAmerica;
	@FindBy(xpath = "//div[@class='page-wrapper']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[3]")
	private WebElement MADFAddressOfAmerica;
	@FindBy(xpath = "(//div[@class='mb-5'])[18]")
	private WebElement MDFAddressOfAmerica;
	@FindBy(xpath = "(//h2[@id='headingTwo'])[2]")
	private WebElement SeconddAddres;
	@FindBy(xpath = "(//div[@class='accordion-body'])[4]")
	private WebElement FulldAddresOfEurope;

	public WebElement getSeconddAddres() {
		return SeconddAddres;
	}

	public WebElement getFulldAddresOfEurope() {
		return FulldAddresOfEurope;
	}

	public WebElement getHQAddressOfAmerica() {
		return HQAddressOfAmerica;
	}

	public WebElement getCOAddressOfAmerica() {
		return COAddressOfAmerica;
	}

	public WebElement getMADFAddressOfAmerica() {
		return MADFAddressOfAmerica;
	}

	public WebElement getMDFAddressOfAmerica() {
		return MDFAddressOfAmerica;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getContainer() {
		return Container;
	}

	public WebElement getWriteRequest() {
		return WriteRequest;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getEnquiry() {
		return Enquiry;
	}

	public WebElement getContactImage() {
		return ContactImage;
	}

}