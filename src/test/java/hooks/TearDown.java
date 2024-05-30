package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class TearDown {
    private final WebDriver driver;

    public TearDown() { this.driver = Setup.driver; }

    @After
    public void quitDriver(Scenario scenario) {
        if (scenario.isFailed())
            saveScreenshotsForScenario(scenario);
        this.driver.quit();
    }

    private void saveScreenshotsForScenario(final Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenShot");
        } catch (WebDriverException e) {
            throw new RuntimeException(e);
        }
    }


}

