import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ListOfUsersPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[text()='k']")
    private WebElement user;
    @FindBy(xpath = "//*[text()=\"Go back to Homepage\"]\n")
    private WebElement goBackButton;

    public ListOfUsersPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void goBack(){
        goBackButton.click();
    }

    public boolean checkUser(){
        return user.isDisplayed();
    }
}
