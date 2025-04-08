package uiTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static org.example.constants.GitHubConstants.GITHUB_BASE_URL;

public class GitHubBaseTest {

    @BeforeAll
    public static void setConfiguration() {
        Configuration.baseUrl = (GITHUB_BASE_URL);
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}