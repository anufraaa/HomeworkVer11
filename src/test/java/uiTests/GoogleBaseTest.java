package uiTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static org.example.constants.GoogleConstants.GOOGLE_BASE_URL;

public class GoogleBaseTest {

    @BeforeAll
    public static void setConfiguration() {
        Configuration.baseUrl = (GOOGLE_BASE_URL);
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}
