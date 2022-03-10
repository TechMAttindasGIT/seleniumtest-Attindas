package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPom {

	public WebElement getContentBlock() {
		return ContentBlock;
	}

	public CareersPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//video[@id='careerVideo']")
	private WebElement CareerVideo;

	@FindBy(xpath = "(//source[@type='video/mp4'])[1]")
	private WebElement TypeOfVideo;
	@FindBy(xpath = " //ul[@class='items']")
	private WebElement breadcrumbs;
	@FindBy(xpath = "// div[@class='container introContent']")
	private WebElement ContentBlock;
	@FindBy(xpath = "(//a[contains(text(),'Join Us')])[1]")
	private WebElement JoinUs;
	@FindBy(xpath = " //span[normalize-space()='Find opportunites at Attindas']")
	private WebElement Findopportunites;
	@FindBy(xpath = "//div[@class='findApportunityRow']//div[2]")
	private WebElement FindopportunitesBlock;
	@FindBy(xpath = "(//a[normalize-space()='CHECK CAREERS'])[1]")
	private WebElement checkCareersButton;
	@FindBy(xpath = "(//div[@class='pagebuilder-column contentSection m-5'])[1]")
	private WebElement CareerNews;
	@FindBy(xpath = "(//div[@class='pagebuilder-column contentSection order-sm-1 order-3 m-5'])[1]")
	private WebElement diversity;
	@FindBy(xpath = "(//h1[normalize-space()='Opportunities for All'])[1]")
	private WebElement headingAll;
	@FindBy(xpath = "//*[@id='opportunitySection']/div[1]/div/div[1]/img")
	private WebElement manufacterimg;

	public WebElement getManufacterimg() {
		return manufacterimg;
	}

	public WebElement getHeadingAll() {
		return headingAll;
	}

	public WebElement getDiversity() {
		return diversity;
	}

	public WebElement getCareerNews() {
		return CareerNews;
	}

	public WebElement getJoinUs() {
		return JoinUs;
	}

	public WebElement getFindopportunites() {
		return Findopportunites;
	}

	public WebElement getFindopportunitesBlock() {
		return FindopportunitesBlock;
	}

	public WebElement getCheckCareersButton() {
		return checkCareersButton;
	}

	public WebElement getBreadcrumbs() {
		return breadcrumbs;
	}

	public WebElement getTypeOfVideo() {
		return TypeOfVideo;
	}

	public WebElement getCareerVideo() {
		return CareerVideo;
	}

}