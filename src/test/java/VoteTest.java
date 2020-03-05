import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoteTest {

    private LoginPage loginPage = new LoginPage();
    private MainNavBar mainNavBar = new MainNavBar();

    @BeforeEach
    public void setup(){
        loginPage.navigate();
        loginPage.loginWithValidData();
    }

    @Test
    public void vote(){
        mainNavBar.voteUp();
        mainNavBar.voteDown();
        assertTrue(mainNavBar.checkVote());
    }
}
