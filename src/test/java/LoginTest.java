import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest extends Initialization{

    private MainNavBar mainNavBar = new MainNavBar();
    private LoginPage loginPage = new LoginPage();

    @BeforeEach
    public void setup(){
        loginPage.navigate();
    }

    @Test
    public void login(){
        mainNavBar.clickLoginButton();
        loginPage.clickOnUserName();
        loginPage.clickOnPassword();
        loginPage.clickOnLogin();
    }
}
