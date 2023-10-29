
import io.qameta.allure.Step;
import page.TestPage;


public class WebSteps{
    TestPage testPage = new TestPage();

    @Step("Open page https://github.com")
    public void openPage() {
        testPage.openPage();
    }

    @Step("Searching rep {value}")
    public void searchingRep(String value) {
        testPage.clickSearch()
                .setValue(value)
                .openSearchElement(value);
    }

    @Step("Open tab Issues")
    public void openTabIssues() {
        testPage.clickIssues();
    }

    @Step("Open Issues {value}")
    public void openIssues(String value) {
        testPage.openIssuesElement(value);
    }

    @Step("Checking name of Issue {value}")
    public void checkingNameOfIssue(String value) {
        testPage.checkResult(value);
    }
}
