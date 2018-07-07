package jcucumberng.project.hooks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import jcucumberng.framework.api.LocalMachine;
import jcucumberng.framework.api.PropsLoader;
import jcucumberng.framework.factory.BrowserFactory;

public class ScenarioHook {
	private static final Logger LOGGER = LoggerFactory.getLogger(ScenarioHook.class);
	private Scenario scenario = null;
	private WebDriver driver = null;

	@Before
	public void beforeScenario(Scenario scenario) throws Throwable {
		this.scenario = scenario;
		LOGGER.info("BEGIN TEST -> " + scenario.getName());

		String browserConfig = PropsLoader.readConfig("browser");
		driver = BrowserFactory.getBrowser(browserConfig);
		LOGGER.info("Browser=" + browserConfig);

		Dimension dimension = LocalMachine.getDimension();
		driver.manage().window().setSize(dimension);
		LOGGER.info("Screen Resolution (WxH)=" + dimension.getWidth() + "x" + dimension.getHeight());
	}

	@After
	public void afterScenario() throws Throwable {
		LOGGER.info("END TEST -> " + scenario.getName() + " - " + scenario.getStatus());
		BrowserFactory.quitBrowser(driver);
	}

	public Scenario getScenario() {
		return scenario;
	}

	public WebDriver getDriver() {
		return driver;
	}

}