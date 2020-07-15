package pages;

import components.NavBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VideoGamePage extends BasePage {

    @FindBy(className = "apphub_AppName")
    private WebElement videoGamePageTitle;

    //aqui quisiera llamar a nameOfGame para usarlo abajo

    public VideoGamePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        NavBar.class.;
    }
//usar aqui el nameOfGame
    public void confirmPageTitleMatchesNameOfGame(){
        System.out.println("HERE");
        String pageTitle = videoGamePageTitle.getText();
        System.out.println(pageTitle.toLowerCase());
        Assert.assertEquals("".toLowerCase(),pageTitle.toLowerCase());
    }
}
