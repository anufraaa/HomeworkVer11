package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ContactSalesPage {
    public static final SelenideElement firstnameInput = $(By.id("form-field-first_name"));

    public static final SelenideElement lastnameInput = $(By.id("form-field-last_name"));


    public void setGetValues(String firstname, String lastname) {
        setUserFirstname(firstname);
        setUserLastname(lastname);
        getUserFirstname();
        getUserLastname();
    }

    public String getUserFirstname() {
        return firstnameInput.getValue();
    }

    public void setUserFirstname(String firstname) {
        firstnameInput.shouldBe(visible).setValue(firstname);
    }

    public String getUserLastname() {
        return lastnameInput.getValue();
    }

    public void setUserLastname(String lastname) {
        lastnameInput.shouldBe(visible).setValue(lastname);
    }
}


