import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RegistrationTest extends Initialization{

    private MainNavBar mainNavBar = new MainNavBar();
    private RegistrationPage registrationPage = new RegistrationPage();

    @BeforeEach
    public void setup(){
        registrationPage.navigate();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/registration.csv", numLinesToSkip = 1)
    public void register(String firstName, String lastName, String email, String userName, String password, String confirmPassword){
        mainNavBar.clickLogoutButtonForRegister();
        mainNavBar.clickRegisterButton();
        registrationPage.clickOnFirstName(firstName);
        registrationPage.clickOnLastName(lastName);
        registrationPage.clickOnEmail(email);
        registrationPage.clickOnUserName(userName);
        registrationPage.clickOnPassword(password);
        registrationPage.clickOnConfirmPassword(confirmPassword);
        registrationPage.clickOnRegister();
        registrationPage.clickOnGOBack();
    }

}
