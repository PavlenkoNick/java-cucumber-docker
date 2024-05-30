import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"junit:target/cucumber-report.xml", "html:target/detailed-report.html"},
        publish = true,
        features = {"src/test/resources/features/"},
        tags = "not @being_developed",
        glue = {"/hooks", "/steps", "/support"}
)

public class RunCucumberTest {
}
