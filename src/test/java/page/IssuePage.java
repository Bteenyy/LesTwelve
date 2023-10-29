package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IssuePage {
    SelenideElement  header = $(".gh-header-show ");
    public IssuePage checkResult(String value) {
        header.shouldHave(text(value));
        return this;
    }
}
