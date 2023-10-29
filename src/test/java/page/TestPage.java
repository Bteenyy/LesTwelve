package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class TestPage {
    SelenideElement search = $(".search-input"),
            builder = $("#query-builder-test"),
            issues = $("#issues-tab"),
            header = $(".gh-header-show ");

    public TestPage openPage() {
        open("https://github.com");
        return this;
    }

    public TestPage clickSearch() {
        search.click();
        return this;
    }

    public TestPage setValue(String value) {
        builder.setValue(value).pressEnter();
        return this;
    }

    public TestPage openSearchElement(String value) {
        $(linkText(value)).click();
        return this;
    }

    public TestPage clickIssues() {
        issues.click();
        return this;
    }

    public TestPage openIssuesElement(String value) {
        $(linkText(value)).click();
        return this;
    }

    public TestPage checkResult(String value) {
       header.shouldHave(text(value));
        return this;
    }
}
