package page;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class IssuesListPage {
    public IssuesListPage openIssuesElement(String value) {
        $(linkText(value)).click();
        return this;
    }
}
