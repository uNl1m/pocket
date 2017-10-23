package pocket.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pocket.driver.SelenoidDriverProvider;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class test {
    @Before
    public void setUp(){
//        Configuration.browser = WebDriverProvider.MyGridProvider.class.getName();
        Configuration.browser = SelenoidDriverProvider.class.getName();

        Configuration.timeout = 6000;
        Configuration.fastSetValue = false;
    }
    @Test
    public void login (){
        open("https://getpocket.com");
        $(byText("Log In")).click();
        $("#feed_id").setValue("test12@test.com");
        $("#login_password").setValue("123456");
        $(byValue("Log In")).click();
//        sleep(5000);
//        $(".nav-username").waitUntil(Condition.visible,5000);
        $(".nav-username").shouldBe(Condition.text("testuser"));

    }

}
