package corporate.utilites;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.ac.generic.BaseClass;

public class CommonFeature extends BaseClass {

	public void verifyLink(String urlLink) {

		try {

			URL link = new URL(urlLink);

			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();

			httpConn.setConnectTimeout(2000);

			httpConn.connect();

			if (httpConn.getResponseCode() == 200) {
				System.out.println(urlLink + " - " + httpConn.getResponseMessage());
			}
			if (httpConn.getResponseCode() == 404) {
				System.out.println(urlLink + " - " + httpConn.getResponseMessage());
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String switchToWindowByTitle(WebDriver driver, String windowTitle) {
		Set<String> handles = driver.getWindowHandles();
		String currentHandle = driver.getWindowHandle();
		for (String handle : handles) {
			driver.switchTo().window(handle);
			if (windowTitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}

		return currentHandle;
	}

	public static String screenShot(WebDriver driver, String filename) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShots\\" + filename + "_" + dateName + ".png";
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}

	public static String getCurrentTime() {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentDate;
	}
}
