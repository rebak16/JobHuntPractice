import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnswerTest extends Initialization{

    private QuestionPage questionPage = new QuestionPage();
    private NewAnswerPage newAnswerPage = new NewAnswerPage();
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
    public void addNewAnswer(){
        login();
        mainNavBar.clickOnQuestion();
        questionPage.addNewAnswer();
        newAnswerPage.fillTitleField();
        newAnswerPage.addNewAnswer();
        assertTrue(questionPage.checkAnswer());
    }
}
