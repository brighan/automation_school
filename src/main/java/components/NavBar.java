package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class NavBar extends BasePage {

    @FindBy(id="foryou_tab")
    private WebElement foryou_tab;

    @FindBy(id="store_nav_search_term")
    private WebElement searchField;

    @FindBy(css = "#searchterm_options > div")
    private List<WebElement> suggestedGamesFromSearchField;

    private List<String> listOfSuggestions;

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

    public void inputTextInSearchField(String nameOfGame){
        this.inputText(searchField,nameOfGame);
        this.submitTextField(searchField);
    }

    public void submitTextField(WebElement element){
        element.submit();
    }

    public void getSuggestedGamesFromSearchField(){
        System.out.println(this.suggestedGamesFromSearchField);
        this.listOfSuggestions = this.getSuggestions(suggestedGamesFromSearchField);
        this.printSuggestions();
    }

    public void printSuggestions(){
        System.out.println(this.listOfSuggestions);
    }

}
