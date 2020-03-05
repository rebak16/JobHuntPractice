import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommentPage extends BasePage{
    private WebDriverWait wait;
    private WebDriver driver;
    @FindBy(xpath = "//*[@id='message']")
    private WebElement messageOfNewAnswer;
    @FindBy(xpath = "//*[text()='Add new comment']")
    private WebElement addNewComment;
    @FindBy(xpath = "//*[text()='kiki']")
    private WebElement commentK;

    public CommentPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void addNewComment(){
        addNewComment.click();
    }

    public void fillMessageField(){
        messageOfNewAnswer.sendKeys("kiki");
    }

    public boolean checkComment(){
        try {
            commentK.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
