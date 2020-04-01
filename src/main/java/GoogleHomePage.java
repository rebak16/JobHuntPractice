import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends BasePage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private String finalURL = "http://google.hu";
    @FindBy(xpath = "//*[@class='gLFyf gsfi']")
    private WebElement googleSearch;
    @FindBy(css = "center:nth-child(1) > .RNmpXc")
    private WebElement googleHaveAGoodDay;
    @FindBy(xpath = "//*[@value=\"coronavirus end\"]")
    private WebElement checkSearch;
    @FindBy(xpath = "//*[@href=\"/doodles\"]")
    private WebElement checkHaveAGoodDay;


    public GoogleHomePage() {
        this.driver = getDriver();
        this.webDriverWait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void navigate(){
        driver.navigate().to(finalURL);
    }

    public void clickSearch() {
        googleSearch.sendKeys("coronavirus end");
        googleSearch.sendKeys(Keys.ENTER);
    }

    public void clickHaveAGoodDay() {
        googleHaveAGoodDay.click();
    }

    public boolean getCheckHaveAGoodDay() {
        return checkHaveAGoodDay.isDisplayed();
    }

    public boolean getCheckSearch() {
        getWait().until(ExpectedConditions.visibilityOf(checkSearch));
        return checkSearch.isDisplayed();
    }
}
