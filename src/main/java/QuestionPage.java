import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionPage extends BasePage{
    private WebDriver driver;
    private WebDriverWait webDriverWait;
    @FindBy(xpath = "//*[text()=\"Go back to Homepage\"]\n")
    private WebElement goBackButton;
    @FindBy(xpath = "//*[text()='Add new answer']")
    private WebElement addNewAnswer;
    @FindBy(xpath = "//*[text()='Edit question\n" +
            "                ']")
    private WebElement editQuestion;
    @FindBy(xpath = "//*[text()='Comment\n" +
            "                ']")
    private WebElement comment;
    @FindBy(xpath = "//*[text()='Drawing canvas with an image picked with Cordova Camera Plugin']")
    private WebElement checkQuestion;
    @FindBy(xpath = "//*[text()='Edit answer\n" +
            "                ']")
    private WebElement answerG;
    @FindBy(xpath = "//*[text()='Delete\n" +
            "                ']")
    private WebElement delete;

    public QuestionPage() {
        this.driver = getDriver();
        this.webDriverWait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void addNewAnswer(){
        addNewAnswer.click();
    }

    public void editQuestion(){
        editQuestion.click();
    }

    public void comment(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(comment));
        comment.click();
    }

    public String checkQuestion(){
        return checkQuestion.getText();
    }

    public void goBack(){
        goBackButton.click();
    }

    public Boolean checkAnswer(){
        return answerG.isDisplayed();
    }

    public void deleteAnswer(){
        delete.click();
    }
}
