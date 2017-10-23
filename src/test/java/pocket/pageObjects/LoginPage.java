package pocket.pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {
    public static SelenideElement
            loginField = $("#feed_id");
    private static SelenideElement
            passwordField = $("#login_password"),
            signInBtn = $(".login-btn-email"),
            loginBtn = $(byText("Log In")),
            erroMessage = $(".login-error");

    private static ElementsCollection
            errorMessages = $$(".error-msg");


    public static void signIn (String email, String password){
        loginBtn.click();
        loginField.setValue(email);
        passwordField.setValue(password);
        signInBtn.click();
    }
    public static void checkErrorMessage(){
        erroMessage.shouldBe(visible);
    }
    public static void checkErrorMessages(){
        errorMessages.shouldHaveSize(2);
    }
}
