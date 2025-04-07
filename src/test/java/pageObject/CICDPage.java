package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CICDPage {
    public static final SelenideElement contactSalesButton = $(By.xpath("//div[@class=\"Primer_Brand__Hero-module__Hero-actions___oH1NT\"]//a[@class=\"Primer_Brand__Button-module__Button___lDruK Primer_Brand__Button-module__Button--secondary___akMC2 Primer_Brand__Button-module__Button--size-medium___EyCyw\"]"));

public void pushContactSalesButton() {
    contactSalesButton.shouldBe(visible).click();
}

}
