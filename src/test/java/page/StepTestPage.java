package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class StepTestPage {
    SelenideElement search = $(".search-input"),
            builder = $("#query-builder-test"),
            issues = $("#issues-tab"),
            header = $(".gh-header-show ");

    public StepTestPage openPage() {
        open("https://github.com");
        return this;
    }

    public StepTestPage clickSearch() {
        search.click();
        return this;
    }

    public StepTestPage setValue(String value) {
        builder.setValue(value).pressEnter();
        return this;
    }

    public StepTestPage openSearchElement(String value) {
        $(linkText(value)).click();
        return this;
    }

    public StepTestPage clickIssues() {
        issues.click();
        return this;
    }

    public StepTestPage openIssuesElement(String value) {
        $(linkText(value)).click();
        return this;
    }

    public StepTestPage checkResult(String value) {
        header.shouldHave(text(value));
        return this;
    }
}
