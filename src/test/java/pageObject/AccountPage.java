package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AccountPage {
    public static final SelenideElement homeTitle = $(By.xpath("//h2[contains(text(),'Home')]"));


    public void isTextHomeDisplayed() {
        homeTitle.shouldBe(visible);

    }
}
