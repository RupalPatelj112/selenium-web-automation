import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        glue = {"com.sitewebpage"},
        features = {"src/test/java"},
        tags = {"@regression"},
        format = {"pretty", "html:target/report"}
)
public class RunCukesTest {
}
