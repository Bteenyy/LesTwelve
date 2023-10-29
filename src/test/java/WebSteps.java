
import io.qameta.allure.Step;
import page.WebStepTestPage;


public class WebSteps {
    WebStepTestPage webStepTestPage = new WebStepTestPage();

    @Step("Open page https://github.com")
    public void openPage() {
        webStepTestPage.openPage();
    }

    @Step("Searching rep {value}")
    public void searchingRep(String value) {
        webStepTestPage.clickSearch()
                .setValue(value)
                .openSearchElement(value);
    }

    @Step("Open tab Issues")
    public void openTabIssues() {
        webStepTestPage.clickIssues();
    }

    @Step("Open Issues {value}")
    public void openIssues(String value) {
        webStepTestPage.openIssuesElement(value);
    }

    @Step("Checking name of Issue {value}")
    public void checkingNameOfIssue(String value) {
        webStepTestPage.checkResult(value);
    }
}
