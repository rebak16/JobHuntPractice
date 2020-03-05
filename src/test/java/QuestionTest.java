import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest extends Initialization {

    private MainNavBar mainNavBar = new MainNavBar();
    private QuestionPage questionPage = new QuestionPage();
    private LoginPage loginPage = new LoginPage();
    private EditQuestionPage editQuestionPage = new EditQuestionPage();
    private CommentPage commentPage = new CommentPage();
    private NewQuestionPage newQuestionPage = new NewQuestionPage();

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
    public void checkQuestion(){
        mainNavBar.clickOnQuestion();
        assertEquals("Drawing canvas with an image picked with Cordova Camera Plugin", questionPage.checkQuestion());
    }

    @Test
    public void editQuestion(){
        login();
        mainNavBar.clickOnQuestion();
        questionPage.editQuestion();
        editQuestionPage.fillTitleField();
        editQuestionPage.editNewQuestion();
        questionPage.editQuestion();
        editQuestionPage.deleteFromTitleField();
        editQuestionPage.editNewQuestion();
        assertEquals("Drawing canvas with an image picked with Cordova Camera Plugin", questionPage.checkQuestion());
    }

    @Test
    public void writeComment(){
        login();
        mainNavBar.clickOnQuestion();
        questionPage.comment();
        commentPage.fillMessageField();
        commentPage.addNewComment();
        assertTrue(commentPage.checkComment());
    }

    @Test
    public void addNewQuestion(){
        login();
        mainNavBar.addNewQuestion();
        newQuestionPage.fillTitleField();
        newQuestionPage.fillMessageField();
        newQuestionPage.addNewQuestion();
        assertEquals("k", newQuestionPage.checkNewQuestion());
        questionPage.goBack();
        mainNavBar.delete();
    }
}
