package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

//No need to init
abstract public class BasePage {

    private static final int TIMEOUT = 5;

    protected  WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver,TIMEOUT);
        actions = new Actions(this.driver);
    }

    public void waitForElementToAppear(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element){
        this.waitForElementToAppear(element);
    }

    public void hoverElement(WebElement element){
        this.waitForElementToAppear(element);
        actions.moveToElement(element).perform();
    }

    public void inputText(WebElement element, String text){
        this.waitForElementToAppear(element);
        element.sendKeys(text);
    }

    public ArrayList<String> getSuggestions(List<WebElement> listOfElements){
        //this.waitForListOfElementsToAppear(listOfElements);
        ArrayList<String> suggestions = new ArrayList<String>();

        for(WebElement element : listOfElements){
            suggestions.add(element.getText());
        }
        return suggestions;
    }

    public void waitForListOfElementsToAppear(List<WebElement> elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public boolean confirmGameIsInSuggestions(List<String> suggestions, String gameExpected){
        //ArrayList<String> suggestionsArray = new ArrayList<String>();
        for(String suggestion : suggestions){
            suggestion.contains(gameExpected);
            return true;
        }
        return false;
    }
}
