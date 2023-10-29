import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.*;

public class ListenerTest extends TestBase {
    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    RepositoryPage repositoryPage = new RepositoryPage();
    IssuesListPage issuesListPage = new IssuesListPage();
    IssuePage issuePage = new IssuePage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Checking Issue")
    @Owner("RS")
    @Severity(SeverityLevel.NORMAL)
    void listenerTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        mainPage.openPage()
                .clickSearch()
                .setValue(testData.SEARCH_TEXT);
        searchResultsPage.openSearchElement(testData.SEARCH_TEXT);
        repositoryPage.clickIssues();
        issuesListPage.openIssuesElement(testData.ISSUE_NAME);
        issuePage.checkResult(testData.ISSUE_NAME);
    }
}
