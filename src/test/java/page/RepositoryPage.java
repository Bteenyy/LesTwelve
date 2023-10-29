package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RepositoryPage {
    SelenideElement  issues = $("#issues-tab");

    public RepositoryPage clickIssues() {
        issues.click();
        return this;
    }
}
