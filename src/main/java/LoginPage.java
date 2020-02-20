import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    @FindBy(xpath = "//*[@name='username']")
    private WebElement username;
    @FindBy(xpath = "//*[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//*[text()='Login'][@type='submit']")
    private WebElement loginButton;
    @FindBy(xpath = "    //*[text()=\"Go back to Homepage\"]\n")
    private WebElement goBackButton;

    public LoginPage() {
        this.webDriverWait = getWait();
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickOnUserName(){
        username.sendKeys("ka");
    }

    public void clickOnPassword(){
        password.sendKeys("ka");
    }

    public void clickOnLogin(){
        loginButton.click();
    }

    public void clickOnGOBack(){
        goBackButton.click();
    }

}
