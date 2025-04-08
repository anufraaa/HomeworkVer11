package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pageObject.GoogleSearchPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoogleTest extends GoogleBaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"qa", "aqa", "cars"})

    public void compareSuggestionsCount(String argument) {
        GoogleSearchPage GoogleSearchPage = new GoogleSearchPage();
        Selenide.open("/");
        GoogleSearchPage.setRequest(argument);
        sleep(1000);
        GoogleSearchPage.getSuggestionsCount();
        Assertions.assertTrue(GoogleSearchPage.getSuggestionsCount() > 5);

    }


}
