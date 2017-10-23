package pocket.driver;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import pocket.steps.MyStepdefs;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverProvider {

    public static class MyGridProvider implements com.codeborne.selenide.WebDriverProvider {
        @Override
        public WebDriver createDriver(DesiredCapabilities capabilities) {
            try {
//                RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:5000/wd/hub"), DesiredCapabilities.chrome());
                RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
                driver.setFileDetector(new LocalFileDetector());
                return driver;
            }
            catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
