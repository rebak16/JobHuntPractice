import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrendingTest extends Initialization {

    private MainNavBar mainNavBar = new MainNavBar();
    private TrendingPage trendingPage = new TrendingPage();

    @BeforeEach
    public void setup(){
        trendingPage.navigate();
    }

    //@Test
    //public void getTrendingPage(){
    //    mainNavBar.checkTrending();
    //    trendingPage.playingVideo();
    //    assertTrue(trendingPage.getPageOpened());
    //}


}
