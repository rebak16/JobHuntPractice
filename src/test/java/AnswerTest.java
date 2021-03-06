import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

public class AnswerTest extends Initialization {

    private QuestionPage questionPage = new QuestionPage();
    private NewAnswerPage newAnswerPage = new NewAnswerPage();
    private LoginPage loginPage = new LoginPage();
    private MainNavBar mainNavBar = new MainNavBar();

    @BeforeEach
    public void setup() {
        loginPage.navigate();
        loginPage.loginWithValidData();
    }


    @ParameterizedTest
    @CsvFileSource(resources = "newAnswer.csv", numLinesToSkip = 1)
    public void addNewAnswer(String titleField) {
        mainNavBar.clickOnQuestion();
        questionPage.addNewAnswer();
        newAnswerPage.fillTitleField(titleField);
        newAnswerPage.addNewAnswer();
        assertTrue(questionPage.checkAnswer());
        questionPage.deleteAnswer();
        questionPage.goBack();
    }
}
