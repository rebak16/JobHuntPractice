import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrendingPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[@aria-selected='true']")
    private WebElement pageOpened;
    @FindBy(xpath = "//a[@id='video-title']")
    private WebElement video;

    public TrendingPage() {
        this.wait = getWait();
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public boolean getPageOpened() {
        return pageOpened.isEnabled();
    }

    public void playingVideo() {
        wait.until(ExpectedConditions.elementToBeClickable(video)).click();

    }
}
