import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.TestPage;

import static io.qameta.allure.Allure.step;


public class StepTest extends ConfigTest {
    TestPage testPage = new TestPage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Checking Issue with step")
    @Owner("RS")
    @Severity(SeverityLevel.NORMAL)
    void stepTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open page https://github.com", () -> testPage.openPage());
        step("Searching rep" + testData.SEARCH_TEXT, () -> testPage.clickSearch()
                .setValue(testData.SEARCH_TEXT)
                .openSearchElement(testData.SEARCH_TEXT));
        step("Open tab Issues", () -> testPage.clickIssues());
        step("Open Issues" + testData.ISSUE_NAME, () -> testPage.openIssuesElement(testData.ISSUE_NAME));
        step("Checking name of Issue" + testData.ISSUE_NAME, () -> testPage.checkResult(testData.ISSUE_NAME));
    }

    @Test
    @DisplayName("Checking Issue with web step")
    @Owner("RS")
    @Severity(SeverityLevel.NORMAL)
    void webStepTests() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps webSteps = new WebSteps();
        webSteps.openPage();
        webSteps.searchingRep(testData.SEARCH_TEXT);
        webSteps.openTabIssues();
        webSteps.openIssues(testData.ISSUE_NAME);
        webSteps.checkingNameOfIssue(testData.ISSUE_NAME);

    }

}
