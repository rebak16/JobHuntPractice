import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewQuestionPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[@id='title']")
    private WebElement titleOfNewQuestion;
    @FindBy(xpath = "//*[@id='message']")
    private WebElement messageOfNewQuestion;
    @FindBy(xpath = "//*[text()='Add new question']")
    private WebElement addNewQuestion;
    @FindBy(xpath = "//*[text()='Comment\n" +
            "                ']")
    private WebElement newQuestion;

    public NewQuestionPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void addNewQuestion(){
        addNewQuestion.click();
    }

    public void fillTitleField(String titleOfQuestion){
        titleOfNewQuestion.sendKeys(titleOfQuestion);
    }

    public void fillMessageField(String messageOfQuestion){
        messageOfNewQuestion.sendKeys(messageOfQuestion);
    }

    public boolean checkNewQuestion(){
        return newQuestion.isDisplayed();
    }

}
