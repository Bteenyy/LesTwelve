package page;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class SearchResultsPage {
    public SearchResultsPage openSearchElement(String value) {
        $(linkText(value)).click();
        return this;
    }
}
