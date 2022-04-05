package com.qa.ac.generic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
  public static WebDriver driver;
  // comment test

  @Parameters(value = "Browser")
  @BeforeClass
  public void openBrowser(@Optional("Chrome") String Browser) throws IOException {

    getDataFromPropertyFIile dfp = new getDataFromPropertyFIile();
    String url = dfp.geturl("url");
    if (Browser.equals("Chrome")) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
    } else if (Browser.equals("FireFox")) {
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
    }
    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
  }

  @AfterClass
  public void closeBrowser() throws IOException {
    driver.quit();
  }
}
