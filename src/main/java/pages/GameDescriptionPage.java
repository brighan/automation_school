package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GameDescriptionPage extends  BasePage {

    @FindBy(className = "apphub_AppName")
    private WebElement gameNamePage;

    public GameDescriptionPage(WebDriver driver) {
        super(driver);
    }

    public void confirmPageTitle(WebElement element){
        System.out.println(element);
        System.out.println("PAGE TITLE: "+gameNamePage.getText());
    }

}
