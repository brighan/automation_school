package tests;

import components.NavBar;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import settings.BaseTest;

public class SteamHomePageTest extends BaseTest {

    private HomePage homePage;
    private NavBar navbar;

    @BeforeTest
    public void setUp(){
        homePage = new HomePage(this.driver);
        navbar = new NavBar(this.driver);
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
        navbar.inputTextInSearchField("Portal Knights");
        navbar.confirmGameIsInSuggestionsAndClickOverIt();
    }
}
