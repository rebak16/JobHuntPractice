import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
        loginPage.loginWithValidData();
    }

    @Test
    public void checkQuestion(){
        mainNavBar.clickOnQuestion();
        assertEquals("Drawing canvas with an image picked with Cordova Camera Plugin", questionPage.checkQuestion());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "editQuestion.csv", numLinesToSkip = 1)
    public void editQuestion(String titleOfEditQuestion, String checkQuestion){
        mainNavBar.clickOnQuestion();
        questionPage.editQuestion();
        editQuestionPage.fillTitleField(titleOfEditQuestion);
        editQuestionPage.editNewQuestion();
        questionPage.editQuestion();
        editQuestionPage.deleteFromTitleField();
        editQuestionPage.editNewQuestion();
        assertEquals(checkQuestion, questionPage.checkQuestion());
    }

    @Test
    public void writeComment(){
        mainNavBar.clickOnQuestion();
        questionPage.comment();
        commentPage.fillMessageField();
        commentPage.addNewComment();
        assertEquals(commentPage.checkComment(), true, "Missing feature");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "newQuestion.csv", numLinesToSkip = 1)
    public void addNewQuestion(String titleOfQuestion, String messageOfQuestion){
        mainNavBar.addNewQuestion();
        newQuestionPage.fillTitleField(titleOfQuestion);
        newQuestionPage.fillMessageField(messageOfQuestion);
        newQuestionPage.addNewQuestion();
        assertTrue(newQuestionPage.checkNewQuestion());
        questionPage.goBack();
        mainNavBar.delete();
    }
}
