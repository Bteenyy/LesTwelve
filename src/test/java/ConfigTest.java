import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class ConfigTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
