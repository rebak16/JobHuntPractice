import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends Initialization{

    private MainNavBar mainNavBar = new MainNavBar();
    private LoginPage loginPage = new LoginPage();

    @BeforeEach
    public void setup(){
        loginPage.navigate();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "login.csv", numLinesToSkip = 1)
    public void login(String username, String password, String errorMessage){
      //  mainNavBar.clickLogoutButtonForLogin();
        mainNavBar.clickLoginButton();
        loginPage.clickOnUserName(username);
        loginPage.clickOnPassword(password);
        loginPage.clickOnLogin();
        assertTrue(mainNavBar.checkLogout(), errorMessage);
        mainNavBar.clickLogoutButtonForLogin();
    }
    /*Given("^Open the Chrome and start application$")
    public void openTheChromeAndStartApplication(){
        loginPage.navigate();
    }

    @When("^I fill the username field with \"<username>\"$")
    public void fillTheUsername(String username) {
        loginPage.clickOnUsername(username);
    }

    @And("^I fill the password field with \"<password>\"$")
    public void fillThePassword(String password) {
        loginPage.clickOnPassword(password);
    }

    @And("^I click on the log in button$")
    public void clickOnTheLoginButton() {
        loginPage.clickOnLogin();
    }

    @Then("^I logged in$")
    public void loggedIn() {
        assertNull(logInButton);
    }

    package operation;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    public class UIOperation {
        WebDriver driver;
        public UIOperation(WebDriver driver){
            this.driver = driver;
        }
        public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
            System.out.println("");
            switch (operation.toUpperCase()) {
                case "CLICK":
                    //Perform click
                    driver.findElement(this.getObject(p,objectName,objectType)).click();
                    break;
                case "SETTEXT":
                    //Set text on control
                    driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
                    break;

                case "GOTOURL":
                    //Get url of application
                    driver.get(p.getProperty(value));
                    break;
                case "GETTEXT":
                    //Get text of an element
                    driver.findElement(this.getObject(p,objectName,objectType)).getText();
                    break;
                default:
                    break;
            }
        }

         * Find element BY using object type and value
         * @param p
         * @param objectName
         * @param objectType
         * @return
         * @throws Exception

        private By getObject(Properties p,String objectName,String objectType) throws Exception{
            //Find by xpath
            if(objectType.equalsIgnoreCase("XPATH")){

                return By.xpath(p.getProperty(objectName));
            }
            //find by class
            else if(objectType.equalsIgnoreCase("CLASSNAME")){

                return By.className(p.getProperty(objectName));

            }
            //find by name
            else if(objectType.equalsIgnoreCase("NAME")){

                return By.name(p.getProperty(objectName));

            }
            //Find by css
            else if(objectType.equalsIgnoreCase("CSS")){

                return By.cssSelector(p.getProperty(objectName));

            }
            //find by link
            else if(objectType.equalsIgnoreCase("LINK")){

                return By.linkText(p.getProperty(objectName));

            }
            //find by partial link
            else if(objectType.equalsIgnoreCase("PARTIALLINK")){

                return By.partialLinkText(p.getProperty(objectName));

            }else
            {
                throw new Exception("Wrong object type");
            }
        }
    }*/
}
