package uiTests;

import pageObject.MainPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopicsTest extends GitHubBaseTest {

    @Test
    public void CompareTopicsList() {
        MainPage MainPage = new MainPage();
        Selenide.open("/");
        MainPage.getTopicsList();
        String[] expectedArray = {"AI","DevOps","Security","Software Development","View all"};
        Assertions.assertArrayEquals(expectedArray,MainPage.getTopicsTexts());
    }
}
