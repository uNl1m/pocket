package pocket;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import pocket.driver.SelenoidDriverProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@signIn"},
        format = {"pretty", "json:target/cucumber.json","html:target/cucumber.html"},
        features = {"src/test/java/pocket/features"},
        glue = "pocket.steps"
)
public class CucumberRunner {

    @BeforeClass
    public static void setUp(){
        Configuration.browser = SelenoidDriverProvider.class.getName();
        Configuration.timeout = 6000;
        Configuration.fastSetValue = false;
        Configuration.baseUrl = "https://getpocket.com";

    }
}
