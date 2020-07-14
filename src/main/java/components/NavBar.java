package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.BasePage;
import pages.VideoGamePage;

import java.util.ArrayList;
import java.util.List;

public class NavBar extends BasePage {

    @FindBy(id="foryou_tab")
    private WebElement foryou_tab;

    @FindBy(id="store_nav_search_term")
    private WebElement searchField;

    @FindBy(css = "#search_suggestion_contents > a >.match_name")
    private List<WebElement> suggestedGamesFromSearchField;

    private List<String> listOfSuggestions;

    public String getNameOfGame() {
        return nameOfGame;
    }

    private String nameOfGame;

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
        this.nameOfGame = nameOfGame;
        this.inputText(searchField,nameOfGame);
    }

    public void submitTextField(WebElement element){
        this.submitTextFieldAfterSearch(element);
    }

    public void getSuggestedGamesFromSearchField(){
        this.listOfSuggestions = this.getSuggestions(suggestedGamesFromSearchField);
    }

    public void printSuggestions(){
        System.out.println(this.listOfSuggestions);
    }

    public void confirmStringIsInListOfSuggestions(){
        Assert.assertTrue(this.confirmGameIsInSuggestions(listOfSuggestions, nameOfGame));
        System.out.println("List: "+listOfSuggestions);
        System.out.println("Game: "+nameOfGame);
    }

    public void confirmGameIsInSuggestionsAndClickOverIt(){
        List<WebElement> optionThatMatches = new ArrayList<WebElement>();

        for(WebElement suggestion : suggestedGamesFromSearchField){
            String suggestedNameOfGame = suggestion.getText();
            if(suggestedNameOfGame.equalsIgnoreCase(this.nameOfGame)){
                optionThatMatches.add(suggestion);
            }
        }
        for(WebElement option : optionThatMatches){
            option.click();
        }
    }
}
