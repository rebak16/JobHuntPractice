import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;


public class ListOfUsersTest extends Initialization{

    private LoginPage loginPage = new LoginPage();
    private MainNavBar mainNavBar = new MainNavBar();
    private RegistrationPage registrationPage = new RegistrationPage();
    private ListOfUsersPage listOfUsersPage = new ListOfUsersPage();


    @BeforeEach
    public void setup(){
        loginPage.navigate();
        //registrationPage.register();
    }

    @Test
    public void checkListOfUsers(){
        mainNavBar.clickOnUsers();
        assertTrue(listOfUsersPage.checkUser());
    }
}
