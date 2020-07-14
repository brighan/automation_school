package pages;

import components.NavBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class VideoGamePage extends BasePage {

    @FindBy(className = "apphub_AppName")
    private WebElement videoGamePageTitle;

    NavBar navbar = new NavBar(driver);
    //aqui quisiera llamar a nameOfGame para usarlo abajo

    public VideoGamePage(WebDriver driver) {
        super(driver);
    }
//usar aqui el nameOfGame
    public void confirmPageTitleMatchesNameOfGame(String nameOfGame){
        String pageTitle = videoGamePageTitle.getText();
        Assert.assertEquals(nameOfGame.toLowerCase(),pageTitle.toLowerCase());
    }
}
