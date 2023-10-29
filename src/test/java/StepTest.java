import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.*;

import static io.qameta.allure.Allure.step;


public class StepTest extends TestBase {
    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    RepositoryPage repositoryPage = new RepositoryPage();
    IssuesListPage issuesListPage = new IssuesListPage();
    IssuePage issuePage = new IssuePage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Checking Issue with step")
    @Owner("RS")
    @Severity(SeverityLevel.NORMAL)
    void stepTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open page https://github.com", () -> mainPage.openPage());
        step("Сlick on search bar", () -> mainPage.clickSearch());
        step("Set value" + testData.SEARCH_TEXT + "on search bar", () -> mainPage.setValue(testData.SEARCH_TEXT));
        step("Open element" + testData.SEARCH_TEXT, () -> searchResultsPage.openSearchElement(testData.SEARCH_TEXT));
        step("Open tab Issues", () -> repositoryPage.clickIssues());
        step("Open Issues" + testData.ISSUE_NAME, () -> issuesListPage.openIssuesElement(testData.ISSUE_NAME));
        step("Checking name of Issue" + testData.ISSUE_NAME, () -> issuePage.checkResult(testData.ISSUE_NAME));
    }

    @Test
    @DisplayName("Checking Issue with web step")
    @Owner("RS")
    @Severity(SeverityLevel.NORMAL)
    void webStepTests() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps webSteps = new WebSteps();
        webSteps.openPage();
        webSteps.clickSearchBar();
        webSteps.setValueSearch(testData.SEARCH_TEXT);
        webSteps.openElement(testData.SEARCH_TEXT);
        webSteps.openTabIssues();
        webSteps.openIssues(testData.ISSUE_NAME);
        webSteps.checkingNameOfIssue(testData.ISSUE_NAME);

    }

}
