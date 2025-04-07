package uiTests;

import pageObject.AccountPage;
import pageObject.AuthorizationPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class AuthorizationTests extends GitHubBaseTest {

    @Test
    public void loginOperationWithBadCreds(){
        AuthorizationPage AuthorizationPage = new AuthorizationPage();
        Selenide.open("/login");
        AuthorizationPage.authOperation("test@yandex.ru","test12345678");
        AuthorizationPage.isErrorMessageDisplayed();

    }
    @Test
    public void successLoginOperation(){
        AuthorizationPage AuthorizationPage = new AuthorizationPage();
        AccountPage AccountPage = new AccountPage();
        Selenide.open("/login");
        AuthorizationPage.authOperation("artemanufriev17@gmail.com","Artem6565.");
        AccountPage.isTextHomeDisplayed();

    }
}

