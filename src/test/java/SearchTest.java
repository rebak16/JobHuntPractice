import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTest extends Initialization{

    private LoginPage loginPage = new LoginPage();
    private MainNavBar mainNavBar = new MainNavBar();
    private SearchPage searchPage = new SearchPage();

    @BeforeEach
    public void setup(){
        loginPage.navigate();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "search.csv", numLinesToSkip = 1)
    public void search(String search){
        mainNavBar.clickOnSearchButton(search);
        assertTrue(searchPage.seeSearchResult());
    }
}
