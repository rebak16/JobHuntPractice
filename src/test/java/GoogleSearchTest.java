import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoogleSearchTest extends Initialization {

    private GoogleHomePage googleHomePage = new GoogleHomePage();

    @BeforeEach
    public void setup(){
        googleHomePage.navigate();
    }

    @Test
    public void googleSearch(){
        googleHomePage.clickSearch();
        Assertions.assertTrue(googleHomePage.getCheckSearch());
    }
}
