package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SustainabilityPom {
	public SustainabilityPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='pagebuilder-overlay pagebuilder-poster-overlay']")
	private WebElement newsImage;

	@FindBy(xpath = "//h1[normalize-space()='A Purposeful Approach to Our World']")
	private WebElement Heading;

	@FindBy(xpath = "//span[contains(text(),'At Attindas, we aspire to make the world a better ')]")
	private WebElement HeadingBlock;

	@FindBy(xpath = "//div[@class='containe']")
	private WebElement container;

	@FindBy(xpath = "(//h2[@data-content-type='heading'][normalize-space()='Our Philosophy'])[1]")
	private WebElement SubHeading;

	@FindBy(xpath = "(//img[@class='pagebuilder-mobile-hidden'])[1]")
	private WebElement Logo;

	@FindBy(xpath = "//div[@class='pagebuilder-column order-lg-1 order-2']//div[@class='ourSociety-description']")
	private WebElement TextUnderSubHeading;

	@FindBy(xpath = "(//img[@class='pagebuilder-mobile-hidden'])[2]")
	private WebElement Image2;

	@FindBy(xpath = "//h2[normalize-space()='Our Environmental Approach']")
	private WebElement ESubHeading;
	@FindBy(xpath = "//a[@href='ourplanet']//span[@data-element='link_text'][normalize-space()='LEARN MORE']")
	private WebElement LearnMore;
	@FindBy(xpath = "//div[@class='pagebuilder-overlay pagebuilder-poster-overlay']")
	private WebElement RespectOurPlanetImage;
	@FindBy(xpath = "//h2[normalize-space()='Our Environmental Approach']")
	private WebElement RespectOurPlanetHeading;
	@FindBy(xpath = "//h3[normalize-space()='We strive to use clean energy']")
	private WebElement RespectOurPlanetHeadingSec;
	@FindBy(xpath = "//h3[normalize-space()='We aim to increase plastic recyclability']")
	private WebElement RespectOurPlanetth;
	@FindBy(xpath = "//div[@class='breadcrumbs brandPath']")
	private WebElement RespectOurPlanetContainer;
	@FindBy(xpath = "//h2[normalize-space()='Our Social Responsibilities']")
	private WebElement socailResponsibility;
	@FindBy(xpath = "(//a[@href='ourcomunities'])[1]")
	private WebElement socailLearnMore;
	@FindBy(xpath = "(//img[@class='pagebuilder-mobile-hidden'])[3]")
	private WebElement socailImage;

	@FindBy(xpath = "(//h2[@data-content-type='heading'])[5]")
	private WebElement governanceCommitment;
	@FindBy(xpath = "(//img[@class='pagebuilder-mobile-hidden'])[4]")
	private WebElement governanceImage;
	@FindBy(xpath = "(//a[@href='governance'])[1]")
	private WebElement governanceLearnMore;

	public WebElement getRespectOurPlanetth() {
		return RespectOurPlanetth;
	}

	/**
	 * @return the socailResponsibility
	 */
	public WebElement getSocailResponsibility() {
		return socailResponsibility;
	}

	/**
	 * @return the socailLearnMore
	 */
	public WebElement getSocailLearnMore() {
		return socailLearnMore;
	}

	/**
	 * @return the socailImage
	 */
	public WebElement getSocailImage() {
		return socailImage;
	}

	/**
	 * @return the governanceCommitment
	 */
	public WebElement getGovernanceCommitment() {
		return governanceCommitment;
	}

	/**
	 * @return the governanceImage
	 */
	public WebElement getGovernanceImage() {
		return governanceImage;
	}

	/**
	 * @return the governanceLearnMore
	 */
	public WebElement getGovernanceLearnMore() {
		return governanceLearnMore;
	}

	public WebElement getRespectOurPlanetContainer() {
		return RespectOurPlanetContainer;
	}

	public WebElement getRespectOurPlanetHeading() {
		return RespectOurPlanetHeading;
	}

	public WebElement getRespectOurPlanetHeadingSec() {
		return RespectOurPlanetHeadingSec;
	}

	public WebElement getRespectOurPlanetContainerth() {
		return RespectOurPlanetth;
	}

	public WebElement getRespectOurPlanetImage() {
		return RespectOurPlanetImage;
	}

	public WebElement getLearnMore() {
		return LearnMore;
	}

	public WebElement getImage2() {
		return Image2;
	}

	public WebElement getESubHeading() {
		return ESubHeading;
	}

	public WebElement getTextUnderSubHeading() {
		return TextUnderSubHeading;
	}

	public WebElement getLogo() {
		return Logo;
	}

	public WebElement getSubHeading() {
		return SubHeading;
	}

	public WebElement getHeadingBlock() {
		return HeadingBlock;
	}

	public WebElement getHeading() {
		return Heading;
	}

	public WebElement getContainer() {
		return container;
	}

	public WebElement getNewsImage() {
		return newsImage;
	}
}
