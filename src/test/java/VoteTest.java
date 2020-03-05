import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoteTest {

    private LoginPage loginPage = new LoginPage();
    private MainNavBar mainNavBar = new MainNavBar();

    @BeforeEach
    public void setup(){
        loginPage.navigate();
    }

    public void login(){
        mainNavBar.clickLoginButton();
        loginPage.clickOnUserName("k");
        loginPage.clickOnPassword("k");
        loginPage.clickOnLogin();
    }

    @Test
    public void vote(){
        login();
        mainNavBar.voteUp();
        mainNavBar.voteDown();
        assertTrue(mainNavBar.checkVote());
    }
}
