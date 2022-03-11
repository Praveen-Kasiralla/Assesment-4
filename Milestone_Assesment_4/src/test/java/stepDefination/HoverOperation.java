package stepDefination;

import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import uistore.HomePageUi;
import utility.BaseClass;
import utility.ConfigReader;

@RunWith(Cucumber.class)
public class HoverOperation extends BaseClass {

	@When("user hovers on about out story is displayed and click on the link")
	public void user_hovers_on_about_out_story_is_displayed_and_click_on_the_link()
			throws InterruptedException, IOException {
		exReport.createNewTestReport("Click on 'Out Story' in Hover Menu");
		home.hoverAndClick("History Of Gillette", HomePageUi.about, HomePageUi.ourStory);
	}

	@Then("verify if {string} is present in our story")
	public void verify_if_is_present_in_our_story(String string) throws IOException {
		exReport.createNewTestReport("Verify if " + string + " present in Our Story");
		outStory.ourStoryContains(string);
	}

	@Given("Initialize the {string} browser")
	public void initialize_the_browser(String browser) throws IOException {
		required();
		driverSetUp(browser);
	}

	@Then("navigate to {string} website")
	public void navigate_to_website(String url) {
		exReport.createNewTestReport("Open Gillette");
		webDriver.openPage(driver, url);
		if (webDriver.getCurrentUrl(driver).equals(ConfigReader.getUrl())) {
			exReport.enterInfoLog("Gillette as opened");
			logs.enterInfoLog("Gillette as opened");
		} else {
			exReport.enterPassLog("Gillette didn't open");
		}
	}

	@Then("exit the browser")
	public void exit_the_browser() throws IOException {
		driverExit();
	}


}
