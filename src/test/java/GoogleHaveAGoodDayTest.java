import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoogleHaveAGoodDayTest extends Initialization{

    private GoogleHomePage googleHomePage = new GoogleHomePage();

    @BeforeEach
    public void setup(){
        googleHomePage.navigate();
    }

    @Test
    public void googleHaveAGoodDay(){
        googleHomePage.clickHaveAGoodDay();
        Assertions.assertTrue(googleHomePage.getCheckHaveAGoodDay());
    }
}
