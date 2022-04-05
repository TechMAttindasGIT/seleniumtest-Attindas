package com.qa.ac.test;

import com.qa.ac.generic.BaseClass;
import com.qa.ac.generic.ExpTitle;
import com.qa.ac.pom.CareersPom;
import com.qa.ac.pom.Homepage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class Careers extends BaseClass {
    @Test
    public void careers() throws InterruptedException, IOException {

        Homepage h = new Homepage(driver);
        boolean careers = h.getCareers().isDisplayed();
        if (careers == true) {
            String text = h.getCareers().getText();
            System.out.println(
                    "'In Home Page ' 'Careers' in Header Section is displaying fine  and text of sub Categoty is :- "
                            + text);
        } else {
            System.out.println("Careers is not present");
        }
        h.getCareers().click();
        ExpTitle e = new ExpTitle();
        String expectedTitle = e.getExpTitle("CRtitle");
        //	System.out.println("expectedTitle-"+expectedTitle);

        //String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            System.out.println("getTitleEEEEEE--->" + driver.switchTo().window(winHandle).getTitle());
            if (driver.switchTo().window(winHandle).getTitle().equalsIgnoreCase(expectedTitle)) {
                driver.switchTo().window(winHandle);
            }
        }

        //driver.switchTo().window(winHandleBefore);

        String actualTitle = h.actualTitle(driver);
        Reporter.log(actualTitle, true);
        System.out.println("actualTitle-" + actualTitle);


        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title of Careers page is match actualTitle is equal to expectedTitle ");
        /*CareersPom cp = new CareersPom(driver); Commendted by Ashish Tikarye 5/4/22
        boolean careervideo = cp.getCareerVideo().isDisplayed();
        if (careervideo == true) {

            System.out.println(
                    "'In  Careers page ' 'Banner Video' in Header Section is displaying fine expected :-True/False :- "
                            + careervideo + " and Attribute of video is :- " + cp.getCareerVideo().getAttribute("id"));

            System.out.println(
                    "Which Type of video present in careers page :- " + cp.getTypeOfVideo().getAttribute("type"));
        } else {
            System.out.println("Banner Video is not present");
        }
        boolean breadcrumbs = cp.getBreadcrumbs().isDisplayed();
        if (breadcrumbs == true) {

            System.out.println(
                    "'In  Careers page ' 'Bread Crumbs' in navigation Section is displaying fine expected :-True/False :- "
                            + breadcrumbs + " and text on Navigation section  is :- " + cp.getBreadcrumbs().getText());
        } else {
            System.out.println("In  Careers page ' 'Bread Crumbs' in navigation Section is is not present");
        }
        boolean block = cp.getContentBlock().isDisplayed();
        if (block == true) {

            System.out.println(
                    "'In  Careers page ' 'Content  block' in container introContent Section is displaying fine expected :-True/False :- "
                            + block);
            System.out.println(
                    " Text Under 'Content  block' in  'Careers page ' is :- " + cp.getContentBlock().getText());
        } else {
            System.out
                    .println("'In  Careers page ' 'Content  block' in container introContent Section  is not present");
        }
        boolean joinButton = cp.getJoinUs().isDisplayed();
        if (joinButton == true) {

            System.out.println(
                    "'In  Careers page ' 'join Us Button' Under container introContent Section is displaying fine expected :-True/False :- "
                            + joinButton + " And text on Button is :- " + cp.getJoinUs().getText());

        } else {
            System.out.println("'join Us Button' Under container introContent Section  is not present");
        }
        boolean CareerHeading = cp.getFindopportunites().isDisplayed();
        if (CareerHeading == true) {

            System.out.println("'In  Careers page ' 'Career Heading'  is displaying fine expected :-True/False :- "
                    + CareerHeading + " And text on Heading is :- " + cp.getFindopportunites().getText());

        } else {
            System.out.println(" 'In  Careers page ' 'Career Heading'    is not present");
        }
        boolean CareerHeadingBlock = cp.getFindopportunitesBlock().isDisplayed();
        if (CareerHeadingBlock == true) {

            System.out.println(
                    "'In  Careers page ' Under Career Heading  ' Discription '  is displaying fine expected :-True/False :- "
                            + CareerHeadingBlock + " And text Under  Career Heading is :- "
                            + cp.getFindopportunitesBlock().getText());

        } else {
            System.out.println(" 'In  Careers page ' Under Career Heading  ' Discription ' is not present");
        }
        boolean CheckCareerButton = cp.getCheckCareersButton().isDisplayed();
        if (CheckCareerButton == true) {

            System.out.println(
                    "'In  Careers page ' Below Career Heading Discription ' Chech career Button '  is displaying fine expected :-True/False :- "
                            + CheckCareerButton + " And text On Button  is :- " + cp.getCheckCareersButton().getText());

        } else {
            System.out.println(
                    " 'In  Careers page ' Below Career Heading Discription ' Chech career Button ' is not present");
        }
        boolean CheckCareerNews = cp.getCareerNews().isDisplayed();
        if (CheckCareerNews == true) {

            System.out.println("'In  Careers page ' 'Career News 'is displaying fine expected :-True/False :- "
                    + CheckCareerNews + " And text carrer News Section  are :- " + cp.getCareerNews().getText());

        } else {
            System.out.println(" 'In  Careers page ' 'Career News 'is is not present");
        }
        boolean CheckDIVERSITY = cp.getDiversity().isDisplayed();
        if (CheckDIVERSITY == true) {

            System.out.println("'In  Careers page ' 'Diversity section  'is displaying fine expected :-True/False :- "
                    + CheckDIVERSITY + " And text under this section  :- " + cp.getDiversity().getText());

        } else {
            System.out.println(" 'In  Careers page ' 'DIVERSITY, EQUITY & INCLUSION 'is is not present");
        }
        JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
        WebElement nElement = cp.getJoinUs();
        jExecutor.executeScript("arguments[0].click();", nElement);
        ExpTitle j = new ExpTitle();

        String expectedTitlej = j.getExpTitle("CRtitle");

        String actualTitlej = h.actualTitle(driver);
        Reporter.log(actualTitlej, true);
        Assert.assertEquals(actualTitlej, expectedTitlej);
        System.out.println("Title of Join Us page is match actualTitle is equal to expectedTitle ");
*/
    }
}