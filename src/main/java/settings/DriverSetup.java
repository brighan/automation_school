package settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


//Define which browser to use
public class DriverSetup {

    private WebDriver driver;

    //page DriverSetup
    public DriverSetup(String browserName, boolean headLess) {
        if(browserName.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            if(headLess){
                options.addArguments("headless");
            }
            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
