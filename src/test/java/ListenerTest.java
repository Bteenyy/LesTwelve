import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.TestPage;


public class ListenerTest extends TestBase {
    TestPage testPage = new TestPage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Checking Issue")
    @Owner("RS")
    @Severity(SeverityLevel.NORMAL)
    void listenerTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        testPage.openPage()
                .clickSearch()
                .setValue(testData.SEARCH_TEXT)
                .openSearchElement(testData.SEARCH_TEXT)
                .clickIssues()
                .openIssuesElement(testData.ISSUE_NAME)
                .checkResult(testData.ISSUE_NAME);
    }
}
