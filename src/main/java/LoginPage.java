import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private MainNavBar mainNavBar = new MainNavBar();
    private String finalURL = "http://172.17.0.1:8000/";
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

    public void navigate(){
        driver.navigate().to(getBaseURL());
    }

    public void loginWithValidData() {
        try {
            mainNavBar.clickLoginButton();
            clickOnUserName("k");
            clickOnPassword("k");
            clickOnLogin();
        } catch (NoSuchElementException  | TimeoutException e) {
          //  mainNavBar.clickLogoutButtonForLogin();
          //  mainNavBar.clickLoginButton();
          //  clickOnUserName("k");
          //  clickOnPassword("k");
          //  clickOnLogin();
        }
    }

    public void clickOnUserName(String userName){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(username));
        username.sendKeys(userName);
    }

    public void clickOnPassword(String passWord){
        password.sendKeys(passWord);
    }

    public void clickOnLogin(){
        loginButton.click();
    }

    public void clickOnGOBack(){
        goBackButton.click();
    }

}
