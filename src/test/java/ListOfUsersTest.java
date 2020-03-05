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
    }

    public void register(){
        mainNavBar.clickRegisterButton();
        registrationPage.clickOnFirstName("k");
        registrationPage.clickOnLastName("k");
        registrationPage.clickOnEmail("k@k");
        registrationPage.clickOnUserName("k");
        registrationPage.clickOnPassword("k");
        registrationPage.clickOnConfirmPassword("k");
        registrationPage.clickOnRegister();
    }

    @Test
    public void checkListOfUsers(){
        //register();
        mainNavBar.clickOnUsers();
        assertTrue(listOfUsersPage.checkUser());
    }
}
