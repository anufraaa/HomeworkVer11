package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchPage {
    public static final SelenideElement searchInput = $(By.className("gLFyf"));

    public static final ElementsCollection searchSuggestionList = $$(By.xpath("//ul[@class='G43f7e']//li"));


    public void setRequest(String request) {
        searchInput.shouldBe(visible).setValue(request);
    }

    public int getSuggestionsCount() {
        return searchSuggestionList.size();
    }

}
