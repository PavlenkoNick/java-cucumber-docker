package hooks;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Setup {
    public static WebDriver driver;

    @Before
    public void setWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--start-maximized");
        options.addArguments("--headless=new");
//        options.addArguments("--window-size=1920,1080");
        this.driver = new ChromeDriver(options);
    }

    @Before
    public void setLogsLevel() {
        // for debugging purpose sets Java logger level to a particular value
        // Java has 7 logger levels: SEVERE, WARNING, INFO, CONFIG, FINE, FINER, and FINEST. The default is INFO.
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.INFO);
        Arrays.stream(logger.getHandlers()).forEach(handler -> {
            handler.setLevel(Level.INFO);
        });
    }
}
