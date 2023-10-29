package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement search = $(".search-input"),
            builder = $("#query-builder-test");

    public MainPage openPage() {
        open("https://github.com");
        return this;
    }

    public MainPage clickSearch() {
        search.click();
        return this;
    }

    public MainPage setValue(String value) {
        builder.setValue(value).pressEnter();
        return this;
    }
}
