package pages;

import components.NavBar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VideoGamePage extends BasePage {

    @FindBy(className = "apphub_AppName")
    private WebElement videoGamePageTitle;

    @FindBy(className = "game_details")
    private WebElement videoGameDetails;

    public VideoGamePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

//usar aqui el nameOfGame
    public void confirmPageTitleMatchesNameOfGame(String nameOfGame){
        String title = videoGamePageTitle.getText();
        Assert.assertEquals(title,nameOfGame);
    }

    public void scrollToSection(){
        this.scrollDownToWebElement(videoGameDetails);
    }
}
