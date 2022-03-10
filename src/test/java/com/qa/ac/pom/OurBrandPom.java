package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurBrandPom {
	public OurBrandPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAll() {
		return All;
	}

	public WebElement getBabycare() {
		return Babycare;
	}

	public WebElement getClinical() {
		return Clinical;
	}

	@FindBy(xpath = "//a[@class='btn btn-primary active']")
	private WebElement All;

	@FindBy(xpath = "//a[@title='Baby Care']")
	private WebElement Babycare;

	@FindBy(xpath = "//a[@title='Clinical']")
	private WebElement Clinical;

	@FindBy(xpath = "(//a[@title='Adult Incontinence'])[1]")
	private WebElement Adult;

	@FindBy(xpath = "//a[@title='Others']")
	private WebElement others;

	@FindBy(xpath = "//a[@title='Comfees']")
	private WebElement Comfees;

	@FindBy(xpath = "//a[@title='Attends']")
	private WebElement attends;

	@FindBy(xpath = "(//a[@title='Incopack'])[1]")
	private WebElement incopack;

	@FindBy(xpath = "//a[@title='Reassure']//img")
	private WebElement reassure;

	@FindBy(xpath = "//a[@title='Chelino']")
	private WebElement chelino;

	@FindBy(xpath = "//a[@title='Addermis']")
	private WebElement addermis;

	@FindBy(xpath = "//a[@title='Indas']")
	private WebElement indas;

	@FindBy(xpath = "//a[@title='Sabanindas']//img")
	private WebElement sabanindas;

	@FindBy(xpath = "//a[@title='Indaslip']//img") //// a[@title='Indaslip']//img
	private WebElement indaslip;

	@FindBy(xpath = "//a[@class='btn btn-primary-blueBg']")
	private WebElement newsalert;

	@FindBy(xpath = "//img[@alt='Attindas Logo']")
	private WebElement brandlogo;
	@FindBy(xpath = "//*[@id='maincontent']/div[1]/div[2]/div/div/div/div/div")
	private WebElement brandImage;

	@FindBy(xpath = "//*[@id='maincontent']/div[1]/div[3]/div/h1")
	private WebElement borderHeading;
	@FindBy(xpath = "//p[contains(text(),'Whether it’s our Attends® brand that pioneered the')]")
	private WebElement text;
	@FindBy(xpath = "//a[@title='Indasec']")
	private WebElement indasec;

	public WebElement getIndasec() {
		return indasec;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getBorderHeading() {
		return borderHeading;
	}

	public WebElement getBrandImage() {
		return brandImage;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getOthers() {
		return others;
	}

	public WebElement getComfees() {
		return Comfees;
	}

	public WebElement getAttends() {
		return attends;
	}

	public WebElement getIncopack() {
		return incopack;
	}

	public WebElement getReassure() {
		return reassure;
	}

	public WebElement getChelino() {
		return chelino;
	}

	public WebElement getAddermis() {
		return addermis;
	}

	public WebElement getIndas() {
		return indas;
	}

	public WebElement getSabanindas() {
		return sabanindas;
	}

	public WebElement getIndaslip() {
		return indaslip;
	}

	public WebElement getNewsalert() {
		return newsalert;
	}

	public WebElement getBrandlogo() {
		return brandlogo;
	}

}
