import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainNavBar extends BasePage {

    private WebDriver driver;
    @FindBy(id = "guide-icon")
    private WebElement menuButton;
    @FindBy(id = "logo")
    private WebElement logo;
    @FindBy(id = "sb_ifc50")
    private WebElement searchField;
    @FindBy(id = "search-icon-legacy")
    private WebElement searchButton;
    @FindBy(className = "style-scope yt-icon-button")
    private WebElement createVideo;
    @FindBy(className = "style-scope ytd-topbar-menu-button-renderer style-default")
    private WebElement applications;
    @FindBy(className = "style-scope ytd-notification-topbar-button-renderer")
    private WebElement notifications;
    @FindBy(className = "style-scope yt-img-shadow")
    private WebElement profilePicture;
    @FindBy(partialLinkText = "Home")
    private WebElement homePage;
    @FindBy(xpath = "//*[text()='Trending']")
    private WebElement trending;
    @FindBy(xpath = "//*[text()='Subscriptions']")
    private WebElement subscriptions;
    @FindBy(partialLinkText = "Library")
    private WebElement library;

    public MainNavBar() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebElement getMenuButton() {
        return menuButton;
    }

    public WebElement getLogo() {
        return logo;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getCreateVideo() {
        return createVideo;
    }

    public WebElement getApplications() {
        return applications;
    }

    public WebElement getNotifications() {
        return notifications;
    }

    public WebElement getProfilePicture() {
        return profilePicture;
    }

    public WebElement getHomePage() {
        return homePage;
    }

    public WebElement getTrending() {
        return trending;
    }

    public WebElement getSubscriptions() {
        return subscriptions;
    }

    public WebElement getLibrary() {
        return library;
    }

    public void checkTrending(){
        getTrending().click();
    }
}
