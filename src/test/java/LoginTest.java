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
}
