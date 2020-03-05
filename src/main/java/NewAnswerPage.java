import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAnswerPage extends BasePage{

    private WebDriverWait wait;
    private WebDriver driver;
    @FindBy(xpath = "//*[@id='message']")
    private WebElement messageOfNewAnswer;
    @FindBy(xpath = "//*[text()='Add new answer']")
    private WebElement addNewAnswer;

    public NewAnswerPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void addNewAnswer(){
        addNewAnswer.click();
    }

    public void fillTitleField(String titleField){
        messageOfNewAnswer.sendKeys(titleField);
    }
}
