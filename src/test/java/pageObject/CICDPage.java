package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CICDPage {
    public static final SelenideElement contactSalesButton = $(By.xpath("//div[contains(@class, 'Hero-actions')]//span[contains(text(),'Contact sales')]"));

    public void pushContactSalesButton() {
        contactSalesButton.shouldBe(visible).click();
    }

}
