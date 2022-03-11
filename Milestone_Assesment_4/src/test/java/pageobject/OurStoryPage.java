package pageobject;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusable.WebDriverHelper;
import uistore.OurStoryPageUi;
import utility.ExtentReport;
import utility.Logs;

public class OurStoryPage {

	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public OurStoryPage(WebDriver driverr, WebDriverHelper webDriverr, ExtentReport exReportt) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReportt;
		logs.createLogger(HomePage.class);
	}
	public void ourStoryContains(String product) throws IOException {
		exReport.enterInfoLog("Checking if our Stories contains "+product);
		logs.enterInfoLog("Checking if our Stories contains "+product);
		List<WebElement> arr = webDriver.getMultipleText(driver, OurStoryPageUi.ourStories);
		boolean contains = false;
		for(WebElement element : arr) {
			if(element.getText().contains(product)) {
				exReport.enterPassLogWithSnap(product+" is in the 'our Stories'");
				logs.enterInfoLog(product+" is in the 'our Stories'");
				contains = true;
				Assert.assertTrue(true);
				break;
			}
		}
		if(!contains) {
			exReport.enterFailLogWithSnap(product+" is not in the 'our Stories'");
			logs.enterInfoLog(product+" is not in the 'our '");
			Assert.assertTrue(false);
		}
	}
}
