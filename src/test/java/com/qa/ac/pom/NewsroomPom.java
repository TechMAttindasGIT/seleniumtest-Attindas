package com.qa.ac.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsroomPom {
	public NewsroomPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='pagebuilder-overlay pagebuilder-poster-overlay']")
	private WebElement newsImage;
	@FindBy(xpath = "//*[@id='maincontent']/div[1]/div[3]/div/h1")
	private WebElement newsBlock;
	@FindBy(xpath = "//h3[contains(text(),'Latest News')]")
	private WebElement latestNewsHeading;
	@FindBy(xpath = "//h3[contains(text(),'Press Release')]")
	private WebElement pressrelease;
	// *[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/ul/li[2]/div/div/div/a
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/ul/li/div[2]/div/div[1]/a")
	private WebElement latestNewsLink;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/a")
	private WebElement viewAllLatestNewsLink;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/a")
	private WebElement viewAllPressNewsLink;
	@FindBy(xpath = "//*[@id='UIOF4TK']/a")
	private WebElement signupForNews;
	@FindBy(xpath = "//a[normalize-space()='Media Contacts >']")
	private WebElement midiaContacts;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[2]/div/div/div/div/h3")
	private WebElement videoLibrary;
	@FindBy(id = "videoId-7")
	private WebElement videoLink;
	@FindBy(xpath = "(//img[@class='playBtn'])")
	private WebElement videoplay;
	@FindBy(xpath = "//*[@id='videoId-main']")
	private WebElement PlayBtn;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/ul/li/div[1]/a/img")
	private WebElement LatestNewsImage;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/ul/li/div[2]/div/div[1]/div/div/span[1]")
	private WebElement NewsDate;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/ul/li/div[2]/div/div[1]/a")
	private WebElement NewsTitle;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[3]/div[1]/h1")
	private WebElement HeaderOfNews;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/ul/li[1]/div/div/div/a")
	private WebElement PressRealese;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/ul/li[2]/div/div/div/a")
	private WebElement WeeklyPressRealese2;
	@FindBy(xpath = "//*[@id='maincontent']/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/ul/li[3]/div/div/div/a")
	private WebElement WeeklyPressRealese3;
	@FindBy(xpath = "//*[@id='maincontent']/div/div/div[3]/div/h1")
	private WebElement SignUpHeading;
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@id='phone_number']")
	private WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement frame;
	@FindBy(xpath = "(//span[@id ='recaptcha-anchor'])")
	private WebElement recaptcha;
	@FindBy(xpath = "//input[@id='is_subscribed']")
	private WebElement subscribed;
	@FindBy(xpath = "//input[@id='terms_condition']")
	private WebElement termsCondition;
	@FindBy(xpath = "//span[normalize-space()='Subscribe']")
	private WebElement subscribedButton;
	@FindBy(xpath = "//div[@role='alert']//span[@id='msgCloseBtn']")
	private WebElement alertSignUp;
	@FindBy(xpath = "//div[@class='pagebuilder-overlay pagebuilder-poster-overlay']")
	private WebElement SignUpImage;
	@FindBy(xpath = "//p[contains(text(),'It will be our pleasure to share with you personal')]")
	private WebElement SignUpHeadingNewsText;
	@FindBy(xpath = "//div[@class='pagebuilder-overlay pagebuilder-poster-overlay']")
	private WebElement ContactUsImage;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement MlastName;

	public WebElement getMlastName() {
		return MlastName;
	}

	public WebElement getContactUsImage() {
		return ContactUsImage;
	}

	public WebElement getContactUsHeading() {
		return ContactUsHeading;
	}

	public WebElement getContactUsHeadingBlock() {
		return contactUsHeadingBlock;
	}

	public WebElement getGobalMeadiaContact() {
		return gobalMeadiaContact;
	}

	@FindBy(xpath = "//h1[contains(text(),'Question or comment?  We’re ready to help')]")
	private WebElement ContactUsHeading;
	@FindBy(xpath = "//p[@id='C27J415']")
	private WebElement contactUsHeadingBlock;
	@FindBy(xpath = "//h1[normalize-space()='Global Media Contact']")
	private WebElement gobalMeadiaContact;

	public WebElement getSignUpImage() {
		return SignUpImage;
	}

	public WebElement getSignUpHeadingNewsText() {
		return SignUpHeadingNewsText;
	}

	public WebElement getSignUpSrction() {
		return SignUpSrction;
	}

	@FindBy(xpath = "//h2[normalize-space()='Subscribe for News here']")
	private WebElement SignUpSrction;

	public WebElement getAlertSignUp() {
		return alertSignUp;
	}

	public WebElement getSubscribed() {
		return subscribed;
	}

	public WebElement getTermsCondition() {
		return termsCondition;
	}

	public WebElement getSubscribedButton() {
		return subscribedButton;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getRecaptcha() {
		return recaptcha;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSignUpHeading() {
		return SignUpHeading;
	}

	public WebElement getPressRealese() {
		return PressRealese;
	}

	public WebElement getWeeklyPressRealese2() {
		return WeeklyPressRealese2;
	}

	public WebElement getWeeklyPressRealese3() {
		return WeeklyPressRealese3;
	}

	public WebElement getHeaderOfNews() {
		return HeaderOfNews;
	}

	public WebElement getNewsTitle() {
		return NewsTitle;
	}

	public WebElement getNewsDate() {
		return NewsDate;
	}

	public WebElement getLatestNewsImage() {
		return LatestNewsImage;
	}

	public WebElement getPlayBtn() {
		return PlayBtn;
	}

	public WebElement getVideoplay() {
		return videoplay;
	}

	public WebElement getVideoLibrary() {
		return videoLibrary;
	}

	public WebElement getLatestNewsHeading() {
		return latestNewsHeading;
	}

	public WebElement getPressrelease() {
		return pressrelease;
	}

	public WebElement getLatestNewsLink() {
		return latestNewsLink;
	}

	public WebElement getViewAllLatestNewsLink() {
		return viewAllLatestNewsLink;
	}

	public WebElement getViewAllPressNewsLink() {
		return viewAllPressNewsLink;
	}

	public WebElement getSignupForNews() {
		return signupForNews;
	}

	public WebElement getMidiaContacts() {
		return midiaContacts;
	}

	public WebElement getVideoLink() {
		return videoLink;
	}

	public WebElement getNewsBlock() {
		return newsBlock;
	}

	public WebElement getNewsImage() {
		return newsImage;
	}
}
