package uiTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class GoogleBaseTest {

    @BeforeAll
    public static void setConfiguration() {
        Configuration.baseUrl = "https://www.google.ru";
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}
