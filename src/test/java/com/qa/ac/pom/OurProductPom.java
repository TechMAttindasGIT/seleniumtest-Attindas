package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurProductPom {

	public OurProductPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[contains(text(),'Products')]")
	private WebElement product;

	@FindBy(xpath = "//*[@id='headerLink-ourProducts']/div/div/div/div[2]/div/img")
	private WebElement image;

	@FindBy(linkText = "Adult Incontinence")
	private WebElement Adult;
	@FindBy(partialLinkText = "Baby Ca")
	private WebElement BabyCare;
	@FindBy(partialLinkText = "Clinical")
	private WebElement Clinical;
	@FindBy(partialLinkText = "Others")
	private WebElement Others;

	@FindBy(xpath = "(//h2[@class='borderedHeading'])[3]")
	private WebElement types;

	@FindBy(xpath = "//p[contains(text(),'Whether it’s just an occasional drip or dribble, o')]")
	private WebElement Discription;

	public WebElement getTypes() {
		return types;
	}

	@FindBy(xpath = "(//div[@class='linear'])")
	private WebElement Liners;
	@FindBy(xpath = "(//div[@class='pads'])")
	private WebElement Pads_and_shields;
	@FindBy(xpath = "(//div[@class='pants'])")
	private WebElement Protective_underwear_pants;

	@FindBy(xpath = "(//div[@class='shape'])")
	private WebElement Shaped;
	@FindBy(xpath = "(//div[@class='breif'])")
	private WebElement Briefs;
	@FindBy(xpath = "(//div[@class='underpad'])")
	private WebElement Underpads;
	@FindBy(xpath = "(//div[@data-appearance='default'])[3]")
	private WebElement babyDiapers;
	@FindBy(xpath = "(//div[@data-appearance='default'])[5]")
	private WebElement trainingPants;
	@FindBy(xpath = "(//div[@data-appearance='default'])[7]")
	private WebElement youthPant;
	@FindBy(xpath = "(//div[@data-appearance='default'])[9]")
	private WebElement changeMates;

	@FindBy(xpath = "(//*[@id='Capa_1'])[1]")
	private WebElement HydrophilicCottonProducts;

	@FindBy(xpath = "(//*[@id='Capa_1'])[2]")
	private WebElement SurgicalGownsandDrapes;

	public WebElement getYouthPant() {
		return youthPant;
	}

	public WebElement getChangeMates() {
		return changeMates;
	}

	public WebElement getHydrophilicCottonProducts() {
		return HydrophilicCottonProducts;
	}

	public WebElement getSurgicalGownsandDrapes() {
		return SurgicalGownsandDrapes;
	}

	public WebElement getProfessionalCare() {
		return ProfessionalCare;
	}

	public WebElement getAfterBirthSpecialtyAids() {
		return AfterBirthSpecialtyAids;
	}

	@FindBy(xpath = "(//*[@id='Capa_1'])[1]")
	private WebElement ProfessionalCare;

	@FindBy(xpath = "(//*[@id='Capa_1'])[2]")
	private WebElement AfterBirthSpecialtyAids;

	public WebElement getBabyDiapers() {
		return babyDiapers;
	}

	public WebElement getTrainingPants() {
		return trainingPants;
	}

	public WebElement getLiners() {
		return Liners;
	}

	public WebElement getPads_and_shields() {
		return Pads_and_shields;
	}

	public WebElement getProtective_underwear_pants() {
		return Protective_underwear_pants;
	}

	public WebElement getShaped() {
		return Shaped;
	}

	public WebElement getBriefs() {
		return Briefs;
	}

	public WebElement getUnderpads() {
		return Underpads;
	}

	public WebElement getDiscription() {
		return Discription;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getBabyCare() {
		return BabyCare;
	}

	public WebElement getClinical() {
		return Clinical;
	}

	public WebElement getOthers() {
		return Others;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getProduct() {
		return product;
	}

}
