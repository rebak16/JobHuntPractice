import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[@name='first_name']")
    private WebElement firstName;
    @FindBy(xpath = "//*[@name='last_name']")
    private WebElement lastName;
    @FindBy(xpath = "//*[@name='email']")
    private WebElement email;
    @FindBy(xpath = "//*[@name='username']")
    private WebElement username;
    @FindBy(xpath = "//*[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//*[@name='confirm_password']")
    private WebElement confirmPassword;
    @FindBy(xpath = "//*[text()='Register']")
    private WebElement registerButton;
    @FindBy(xpath = "//*[text()=\"Go back to Homepage\"]\n")
    private WebElement goBackButton;


    public RegistrationPage() {
        this.wait = getWait();
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickOnFirstName(String firstNameField){
        firstName.sendKeys(firstNameField);
    }

    public void clickOnLastName(String lastNameField){
        lastName.sendKeys(lastNameField);
    }

    public void clickOnEmail(String emailField){
        email.sendKeys(emailField);
    }

    public void clickOnUserName(String usernameField){
        username.sendKeys(usernameField);
    }

    public void clickOnPassword(String passwordField){
        password.sendKeys(passwordField);
    }

    public void clickOnConfirmPassword(String confirmPasswordField){
        confirmPassword.sendKeys(confirmPasswordField);
    }

    public void clickOnRegister(){
        registerButton.click();
    }

    public void clickOnGOBack(){
        goBackButton.click();
    }
}
