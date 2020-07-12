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

    @Test
    public void testClickBannerSummerSales(){
        homePage.clickBannerSummerSale();
    }

    @Test(priority = 1)
    public void openForYouTab(){
        navbar.hoverForyouTab();
    }
}
