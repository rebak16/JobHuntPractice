import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditQuestionPage extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[@id='title']")
    private WebElement titleOfEditQuestion;
    @FindBy(xpath = "//*[@id='message']")
    private WebElement messageOfEditQuestion;
    @FindBy(xpath = "//*[text()='Edit new question']")
    private WebElement editNewQuestion;

    public EditQuestionPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void editNewQuestion(){
        editNewQuestion.click();
    }

    public void fillTitleField(String titleOfEditedQuestion){
        titleOfEditQuestion.sendKeys(titleOfEditedQuestion);
    }

    public void deleteFromTitleField(){
        titleOfEditQuestion.sendKeys(Keys.BACK_SPACE);
    }

    public void fillMessageField(){
        messageOfEditQuestion.sendKeys("k");
    }
}
