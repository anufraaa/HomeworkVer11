package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {
    public static final SelenideElement emailInput = $(By.id("login_field"));

    public static final SelenideElement passwordInput = $(By.id("password"));

    public static final SelenideElement submitButton = $(By.xpath("//input[@name=\"commit\"]"));

    public static final SelenideElement invalidCredErrorMessage = $(By.xpath("//div[contains(text(),'Incorrect username or password.')]"));

    public void authOperation(String login,String password){
        setUserEmail(login);
        setUserPassword(password);
        pushSubmitButton();
    }


    public void setUserEmail(String login){
        emailInput.shouldBe(visible).setValue(login);
    }

    public void setUserPassword(String password){
        passwordInput.shouldBe(visible).setValue(password);
    }
    public void pushSubmitButton(){
        submitButton.shouldBe(visible).click();
    }

    public void isErrorMessageDisplayed(){
        invalidCredErrorMessage.shouldBe(visible);
    }

}
