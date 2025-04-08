package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.AccountPage;
import pageObject.AuthorizationPage;

import static org.example.constants.GitHubConstants.*;

public class AuthorizationTests extends GitHubBaseTest {

    @Test
    public void loginOperationWithBadCreds() {
        AuthorizationPage AuthorizationPage = new AuthorizationPage();
        Selenide.open(SIGN_IN_PAGE);
        AuthorizationPage.authOperation(GITHUB_USER_LOGIN,GITHUB_USER_PASSWORD);
        AuthorizationPage.isErrorMessageDisplayed();
    }

    @Test
    public void successLoginOperation() {
        AuthorizationPage AuthorizationPage = new AuthorizationPage();
        AccountPage AccountPage = new AccountPage();
        Selenide.open(SIGN_IN_PAGE);
        AuthorizationPage.authOperation("artemanufriev17@gmail.com", "Artem6565.");
        AccountPage.isTextHomeDisplayed();

    }
}

