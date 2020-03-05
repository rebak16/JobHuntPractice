
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class Initialization {

    private WebDriver driver;

    @BeforeEach
    public void init() {
        driver = WebDriverManager.initDriver();
    }

    @AfterEach
    public void teardown() {
        WebDriverManager.getDriver().close();
        WebDriverManager.quit();
    }

}
