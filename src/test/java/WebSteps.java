
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;


public class WebSteps {
    SelenideElement search = $(".search-input"),
            builder = $("#query-builder-test"),
            issues = $("#issues-tab"),
            header = $(".gh-header-show ");

    @Step("Open page https://github.com")
    public void openPage() {
        open("https://github.com");
    }

    @Step("Сlick on search bar")
    public void clickSearchBar() {
        search.click();
    }

    @Step("Set value {value} on search bar")
    public void setValueSearch(String value) {
        builder.setValue(value).pressEnter();
    }

    @Step("Open element {value}")
    public void openElement(String value) {
        $(linkText(value)).click();
    }

    @Step("Open tab Issues")
    public void openTabIssues() {
        issues.click();
    }

    @Step("Open Issues {value}")
    public void openIssues(String value) {
        $(linkText(value)).click();
    }

    @Step("Checking name of Issue {value}")
    public void checkingNameOfIssue(String value) {
        header.shouldHave(text(value));
    }
}
