import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchTest extends Initialization{

    private LoginPage loginPage = new LoginPage();
    private MainNavBar mainNavBar = new MainNavBar();
    private SearchPage searchPage = new SearchPage();

    @BeforeEach
    public void setup(){
        loginPage.navigate();
    }

    @Test
    public void search(){
        mainNavBar.clickOnSearchButton();
        assertTrue(searchPage.seeSearchResult());
    }
}
