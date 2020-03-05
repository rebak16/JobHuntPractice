import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainNavBar extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[text()='Register']")
    private WebElement registerButton;
    @FindBy(xpath = "//*[text()='Login']")
    private WebElement loginButton;
    @FindBy(xpath = "//*[text()='List Of Users']")
    private WebElement listOfUsers;
    @FindBy(xpath = "//*[@class='search-txt']")
    private WebElement search;
    @FindBy(xpath = "//*[text()='Drawing canvas with an image picked with Cordova Camera Plugin']")
    private WebElement question;
    @FindBy(xpath = "//*[@class='voteup']")
    private WebElement voteUp;
    @FindBy(xpath = "//*[@class='vote']")
    private WebElement voteDown;
    @FindBy(xpath = "//*[text()='Add new question']")
    private WebElement addNewQuestion;
    @FindBy(xpath = "//*[text()='Logout']")
    private WebElement logoutButton;
    @FindBy(xpath = "//*[text()='Delete']")
    private WebElement delete;
    @FindBy(xpath = "//*[text()=57]")
    private WebElement checkVote;

    public MainNavBar() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void clickOnUsers(){
        listOfUsers.click();
    }


    public void clickRegisterButton(){
        registerButton.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }

    public void clickOnQuestion() {
        question.click();
    }

    public boolean checkLogout(){
        return logoutButton.isDisplayed();
    }

    public void clickOnSearchButton(){
        search.click();
        search.sendKeys("hi");
        search.sendKeys(Keys.ENTER);
    }

    public void addNewQuestion(){
        addNewQuestion.click();
    }

    public void delete(){
        delete.click();
    }

    public void voteUp(){
        voteUp.click();
    }

    public void voteDown(){
        voteDown.click();
    }

    public Boolean checkVote(){
        return checkVote.isDisplayed();
    }
}
