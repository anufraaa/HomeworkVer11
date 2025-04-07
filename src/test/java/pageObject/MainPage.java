package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class MainPage {
    public static final SelenideElement solutionsButton = $(By.xpath("//button[contains(text(),'Solutions')]"));

    public static final SelenideElement cicdButton = $(By.xpath("//a[contains(text(),'CI/CD')]"));

    public static final SelenideElement resoursesButton = $(By.xpath("//button[contains(text(),'Resources')]"));

    public static final ElementsCollection topicsList = $$(By.xpath("//ul[@aria-labelledby=\"resources-topics-heading\"]/li"));


    public void goToCiCd () {
        pushSolutionsButton();
        pushCicdButton();
    }

    public void getTopicsList() {
        pushResourcesButton();
        getTopicsTexts();
    }



    public void pushSolutionsButton() {
        solutionsButton.shouldBe(visible).click();
    }

    public void pushCicdButton() {
        cicdButton.shouldBe(visible).click();
    }

    public void pushResourcesButton() {
        resoursesButton.shouldBe(visible).click();
    }

    public Object[] getTopicsTexts() {
        return topicsList.texts().toArray();
    }

}

