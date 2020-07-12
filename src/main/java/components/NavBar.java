package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class NavBar extends BasePage {

    @FindBy(id="foryou_tab")
    private WebElement foryou_tab;

    public NavBar(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public void hoverForyouTab(){
        this.hoverElement(this.foryou_tab);
    }


    private void openNavBarTab(WebElement tab){
        String isFocus = tab.getAttribute("class");

    }

}
