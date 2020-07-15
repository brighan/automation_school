package tests;

import components.NavBar;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.VideoGamePage;
import settings.BaseTest;

public class SteamHomePageTest extends BaseTest {

    private HomePage homePage;
    private NavBar navbar;
    private VideoGamePage videoGamePage;

    @BeforeTest
    public void setUp(){
        homePage = new HomePage(this.driver);
        navbar = new NavBar(this.driver);
        videoGamePage = new VideoGamePage(this.driver);
    }

    @Test(priority = 2)
    public void testClickBannerSummerSales(){

        homePage.clickBannerSummerSale();
    }

    @Test(priority = 1)
    public void openForYouTab(){
        navbar.hoverForyouTab();
    }

    @Test(priority = 3)
    public void searchInStoreField(){
        navbar.inputTextInSearchField("Portal");
        navbar.getSuggestedGamesFromSearchField();
        navbar.confirmStringIsInListOfSuggestions();
    }

    @Test(priority = 4)
    public void searchAGameAndGoItsPage(){
        String gameOfName = "Portal Knights";
        navbar.inputTextInSearchField(gameOfName);
        navbar.confirmGameIsInSuggestionsAndClickOverIt();
        videoGamePage.confirmPageTitleMatchesNameOfGame(gameOfName);
    }

    @Test(priority = 5)
    public void searchAgeOfEmpiresAndGetItsInfo(){
        String nameOfGame = "Age of Empires II: Definitive Edition";
        navbar.inputTextInSearchField(nameOfGame);
        navbar.confirmGameIsInSuggestionsAndClickOverIt();
        videoGamePage.confirmPageTitleMatchesNameOfGame(nameOfGame);
    }
}
