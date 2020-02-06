import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private static WebDriver driver = new ChromeDriver();


    private WebDriverManager() {
    }

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/Downloads/chromedriver_linux64 (1)/chromedriver");
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver initDriver() {
        if (driver != null) {
            return driver;
        } else {
            System.setProperty("webdriver.chrome.driver", "/Downloads/chromedriver_linux64 (1)/chromedriver");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quit() {
        driver.quit();
        driver = null;
    }
}
