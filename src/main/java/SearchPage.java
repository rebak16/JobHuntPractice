import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[text()='See question']")
    private WebElement seeQuestion;
    @FindBy(xpath = "//*[text()=\"Go back to Homepage\"]\n")
    private WebElement goBackButton;

    public SearchPage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public boolean seeSearchResult(){
        try {
            return seeQuestion.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void goBack(){
        goBackButton.click();
    }
}
