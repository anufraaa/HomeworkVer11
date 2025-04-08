package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObject.CICDPage;
import pageObject.ContactSalesPage;
import pageObject.MainPage;

public class CompareTests extends GitHubBaseTest {

    @Test
    public void CompareFirstLastName() {
        MainPage MainPage = new MainPage();
        ContactSalesPage ContactSalesPage = new ContactSalesPage();
        CICDPage CICDPage = new CICDPage();
        Selenide.open("/");
        MainPage.goToCiCd();
        CICDPage.pushContactSalesButton();
        ContactSalesPage.setGetValues("Artyom", "Anufriev");
        Assertions.assertEquals("Artyom", ContactSalesPage.getUserFirstname());
        Assertions.assertEquals("Anufriev", ContactSalesPage.getUserLastname());
    }
}
