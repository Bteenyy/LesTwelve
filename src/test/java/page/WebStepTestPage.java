package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebStepTestPage {
    SelenideElement search = $(".search-input"),
            builder = $("#query-builder-test"),
            issues = $("#issues-tab"),
            header = $(".gh-header-show ");

    public WebStepTestPage openPage() {
        open("https://github.com");
        return this;
    }

    public WebStepTestPage clickSearch() {
        search.click();
        return this;
    }

    public WebStepTestPage setValue(String value) {
        builder.setValue(value).pressEnter();
        return this;
    }

    public WebStepTestPage openSearchElement(String value) {
        $(linkText(value)).click();
        return this;
    }

    public WebStepTestPage clickIssues() {
        issues.click();
        return this;
    }

    public WebStepTestPage openIssuesElement(String value) {
        $(linkText(value)).click();
        return this;
    }

    public WebStepTestPage checkResult(String value) {
        header.shouldHave(text(value));
        return this;
    }
}
