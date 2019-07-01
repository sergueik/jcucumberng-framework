package project.stepdefs;

import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import jcucumberng.api.Selenium;
import project.hooks.ScenarioHook;

/*
 * Define steps reusable for any application.
 */
public class GlobalSteps {

	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalSteps.class);
	private Selenium selenium = null;

	// PicoContainer injects ScenarioHook object
	public GlobalSteps(ScenarioHook scenarioHook) {
		selenium = scenarioHook.getSelenium();
	}

	@Given("^I Am At Page: (.*)$")
	public void I_Am_At_Page(String key) throws Throwable {
		String url = selenium.navigate(key);
		LOGGER.debug("Page URL={}", url);
	}

	@Then("^I Should See Page Title: (.*)$")
	public void I_Should_See_Page_Title(String expected) throws Throwable {
		String actual = selenium.getPageTitle();
		LOGGER.debug("Page Title={}", actual);
		Assertions.assertThat(actual).isEqualTo(expected);
	}

}
