import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ListOfUsersTest {

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
